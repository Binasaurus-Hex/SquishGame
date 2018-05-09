package game;

import java.awt.Graphics;
import java.awt.Point;

public class Planet extends GameObject{

	private double radius,density;

	public double getMass() {
		return radius
	}



	public void setMass(double mass) {
		this.mass = mass;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public double getDensity() {
		return density;
	}



	public void setDensity(double density) {
		this.density = density;
	}



	public Planet(Point position, Point velocity, double density, double radius, ID id) {
		super(position,velocity, id);
		
	}
	
	
	
	void update() {
		// TODO Auto-generated method stub
		super.update();
	}

	
	void render(Graphics g) {
		// TODO Auto-generated method stub
		super.render(g);
	}

}
