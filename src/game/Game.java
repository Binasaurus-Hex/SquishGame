package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private Handler handler;
	private boolean running = false;
	

	public Game(){
		new Window(WIDTH, HEIGHT, "Game", this);
		handler = new Handler();
	}

	public synchronized void start(){
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			while(delta >= 1){
				update();
				delta--;
			}
			if(running){
				render();
				frames++;
			}
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: "+ frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void update(){
		handler.update();
	}
	
	private void render(){
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null){
			this.createBufferStrategy(2);
			return;
		}
		
		Graphics g = buffer.getDrawGraphics();
		handler.render(g);
		g.dispose();
		buffer.show();
	}
	
	public static void main(String[] args) {
		new Game();
	}
}
