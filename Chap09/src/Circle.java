
public class Circle {
//	Data members
	private double radius;
	private String color = "";
	private static int numCircles = 0;

//	Default constructor
	public Circle() {
		System.out.println("New circle created");
		radius = 1.0;
		Circle.numCircles++;
	}

//	Convenience constructor
	public Circle(int radius, String color) {
		System.out.println("New circle created");
		this.radius = radius;
		this.color = color;
		Circle.numCircles++;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getDiameter() {
		return radius * 2.0;
	}

	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}

}
