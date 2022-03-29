package entities;

import entities.enums.Color;
import entities.interfaces.Shape;

public abstract class AbstractShape implements Shape {
	
	protected Color color;

	public AbstractShape(Color color) {
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
