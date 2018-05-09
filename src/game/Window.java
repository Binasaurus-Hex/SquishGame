package game;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;
	private int width,height; 
	
	
	public Window(int width, int height, String title, Game game){
		this.width = width;
		this.height = height;
		frame = new JFrame(title);
		frame.add(game);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setSize(this.width,this.height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.start();
	}
}
