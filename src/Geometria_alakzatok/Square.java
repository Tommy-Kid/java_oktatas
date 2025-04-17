package Geometria_alakzatok;

public class Square extends Shape{
	
	public Square(int size) {
		super(size,size);
		draw();
	}
	
	@Override
	public void draw() {
		for(int i=0; i < x; i++) {
			for(int j=0; j < x; j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}
}