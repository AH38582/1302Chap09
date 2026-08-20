// Defining public class Circle for object circle
public class Circle {
	
//	data members
	private double radius;
	
//	default constructor
	public Circle () {
		radius = 1.0;
	}
	
//	Convenience constructor
	public Circle (double radius) {
		this.radius = radius;
	}
	
//	behaviors for circle
	
	double getDiameter() {
		return Math.PI * radius * radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return Math.PI * radius * 2;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	

}
