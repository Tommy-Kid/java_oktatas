package geometric_shapes;

public class Circle extends Shape{

	public Circle(int x) {
		super(x, 0);
		draw();
	}

	@Override
	public void draw() {
	    int radius = x; 
	    for (int i = 0; i <= 2 * radius; i++) {
	        for (int j = 0; j <= 2 * radius; j++) {
	            int dx = i - radius;
	            int dy = j - radius;
	            double distance = Math.sqrt(dx * dx + dy * dy);

	            if (distance >= radius - 0.5 && distance <= radius + 0.5) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}

}
