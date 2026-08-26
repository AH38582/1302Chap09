package chap09;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(-27.0, null);
		Circle c3 = new Circle(27.0, "Pink");
		
		Circle[] circles = { c1, c2, c3 };
		
		Circle.printCircleArray(circles);
		c1.printCircle(c1);
		c1.printAreas(c3, 7);

	}

	

	
	
	

}
