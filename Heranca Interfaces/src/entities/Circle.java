package entities;

import entities.enums.Color;

public class Circle extends AbstractShape {
	
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
	
	@Override
	public Double area() {
		return PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + area() + "]";
	}
	
	public boolean equals(Object objeto) {
		if(!(objeto instanceof Circle)) return false;
		
		Circle other = (Circle)objeto;
		
		return this.radius == other.getRadius() 
				&& this.color == other.getColor();
		
		
	}

	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
