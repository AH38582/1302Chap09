package chap09;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(30, "Blue");
		
		c1.setRadius(2.0);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getColor());
		System.out.println("Number of circles: " + Circle.getNumCircles());
		
	}

}
