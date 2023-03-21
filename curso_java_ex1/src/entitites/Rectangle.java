package entitites;

public class Rectangle {
	public double x;
	public double y;
	
	public double area() {
		return x*y;
	}
	
	public double perimeter() {
		return x*2 + y*2;
	}
	
	public double diagonal() {
		return Math.sqrt(x*x + y*y);
	}

}
