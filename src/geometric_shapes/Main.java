package geometric_shapes;

public class Main {
	public static void main (String[] args) {
		String[] shapes = {"Square","Rectangle","Triangle","Parallelogram","Circle"};


		//choose 5 shapes
		for(int i = 0; i<5; i++) {
			String shape = shapes[i];
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
			  case "Circle":
				  System.out.print("Circle \n");
				  new Circle(3);
				  System.out.println();
				  break;	   
			  default:
			    // code block
			}
		}

	}
}