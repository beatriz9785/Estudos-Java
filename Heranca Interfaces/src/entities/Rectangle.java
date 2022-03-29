package entities;

import entities.enums.Color;

public class Rectangle extends AbstractShape{
	
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
	
	@Override
	public Double area() {
		return altura * largura;
	}

	@Override
	public String toString() {
		return "Rectangle [altura=" + altura + ", largura=" + largura + ", area()=" + area() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura)) {
			return false;
		}
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura)) {
			return false;
		}
		return true;
	}

	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
