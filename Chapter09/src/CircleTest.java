
public class CircleTest {

	public static void main(String[] args) {
//		main methods are where object instances are created
		Circle circ1 = new Circle();
		
		circ1.setRadius(8.9);
		Circle circ2 = new Circle(2.0);
		
		
		System.out.println(circ1.getRadius());
		System.out.println(circ2.getRadius());

	}

}
