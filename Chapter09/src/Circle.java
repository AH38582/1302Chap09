
public class Circle {
	private double radius;
	
	public Circle() {
		System.out.println("New circle created");
		radius = 1.0;
	}
	
	public Circle(int radius) {
		System.out.println("New circle created");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		
	}
	
	
	
}
