package geometric_shapes;

public class Triangle extends Shape {

	public Triangle(int x) {
		super(x, 0);
		draw();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}


}
