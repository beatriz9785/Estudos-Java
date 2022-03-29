package application;

import entities.Circle;
import entities.enums.Color;

public class Program {

	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(Color.BLUE, 2.0);
		Circle c2 = new Circle(Color.PURPLE, 2.0);
		
		System.out.println(c1.equals(c2));

	}

}
