package game;

import static java.lang.Math.*;
public abstract class Maths {
	
	/*
	 * returns the volume of the sphere with the given radius
	 */
	public static double volumeSphere(double radius){
		double volume = (4 / 3) * PI * pow(radius, 3);
		return volume;
	}
}
