package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private double radius;
	private static final double PI = 3.141592;
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}
	
	public double area() {
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + area() + "]";
	}
	
	
	

}
