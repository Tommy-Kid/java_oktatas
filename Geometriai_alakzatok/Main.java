package Geometriai_alakzatok;

import java.util.Random;
import Geometriai_alakzatok.*;

public class Main {
	public static void main (String[] args) {
		String[] shapes = {"Square","Rectangle","Triangle","Parallelogram"};
		Random rand = new Random();

		//choose 5 shapes
		for(int i = 0; i<5; i++) {
			int random = rand.nextInt(shapes.length);
			String shape = shapes[random];
			switch(shape) {
			  case "Square":
			    System.out.print("Square \n");
				new Square(4);
			    System.out.println();
			    break;
			  case "Rectangle":
				  System.out.print("Rectangle \n");
				  new Rectangle(3, 6);
				  System.out.println();
			    break;
			  case "Triangle":
				  System.out.print("Triangle \n");
				  new Triangle(5);
				  System.out.println();
				  break;
			  case "Parallelogram":
				  System.out.print("Parallelogram \n");
				  new Parallelogram(4,6);
				  System.out.println();
				  break;
			  default:
			    // code block
			}
		}
		
	}
}
