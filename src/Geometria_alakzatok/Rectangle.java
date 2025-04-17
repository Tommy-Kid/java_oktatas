package Geometriai_alakzatok;

public class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		super(x, y);
		draw();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		for(int i=0; i < x; i++) {
			for(int j=0; j < y; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}
