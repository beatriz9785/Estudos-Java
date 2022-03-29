package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static List <Shape> geometria = new ArrayList<>();
	
	public static void main(String[] args) {
		
		geometria.add(new Circle(Color.BLUE, 4.0));
		geometria.add(new Rectangle(Color.PURPLE, 6.0, 10.0));
		geometria.add(new Circle(Color.BLUE, 8.0));
		
		geometria.forEach(System.out::println);

	}

}
