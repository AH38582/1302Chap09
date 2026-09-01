package chap09;

public class Rectangle {
	private double width, length;
	private static int numOfRectangles;
	
	
	public Rectangle() {
		this(1.0, 1.0);
	}
	
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
		Rectangle.numOfRectangles++;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public static int getNumOfRectangles() {
		return Rectangle.numOfRectangles;
	}
	
	

}
