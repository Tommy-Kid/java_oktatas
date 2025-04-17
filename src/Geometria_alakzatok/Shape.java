package Geometriai_alakzatok;

public abstract class Shape {
	protected int x; // rows
	protected int y; //column
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}


