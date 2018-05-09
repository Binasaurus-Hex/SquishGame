package game;

import java.awt.Graphics;
import java.awt.Point;

public abstract class GameObject {
	protected Point position,velocity;
	protected ID id;
	
	public GameObject(int x, int y, int velX, int velY, ID id){
		position.setLocation(x, y);
		velocity.setLocation(velX,velY);
		this.id = id;
	}
	
	public GameObject(Point position,Point velocity, ID id){
		this.position = position;
		this.velocity = velocity;
		this.id = id;
	}
	
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Point getVelocity() {
		return velocity;
	}

	public void setVelocity(Point velocity) {
		this.velocity = velocity;
	}

	public double getX() {
		return position.getX();
	}

	public void setX(int x) {
		position.x = x;
	}

	public double getY() {
		return position.getY();
	}

	public void setY(int y) {
		position.y = y;
	}

	public double getVelX() {
		return velocity.getX();
	}

	public void setVelX(int velX) {
		velocity.x = velX;
	}

	public double getVelY() {
		return velocity.getY();
	}

	public void setVelY(int velY) {
		velocity.y = velY;
	}
	
	public ID getID(){
		return this.id;
	}
	
	public void setID(ID id){
		this.id = id;
	}
	
	void update(){
		
	}
	
	void render(Graphics g){
		
	}
}
