package geometric_shapes;

public class Parallelogram extends Shape{

	public Parallelogram(int x, int y){
		super(x,y);
		draw();
	}

	@Override
	public void draw() {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) 
			    	System.out.print(" ");
			for (int j = 1; j <= y; j++) 
				System.out.print("*");
			System.out.println();
		}

	}

}