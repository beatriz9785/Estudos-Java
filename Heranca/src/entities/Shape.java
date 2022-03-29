package entities;

import entities.enums.Color;

public class Shape {
	
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override //para sobrescrever um método da classe pai, nesse caso, Object
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
	

}
