package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	private double altura;
	private double largura;
	
	public Rectangle(Color color, double altura, double largura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area() {
		return altura * largura;
	}

	@Override
	public String toString() {
		return "Rectangle [altura=" + altura + ", largura=" + largura + ", area()=" + area() + "]";
	}
	
	

}
