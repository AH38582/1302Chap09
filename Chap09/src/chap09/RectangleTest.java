package chap09;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.printf("Rectangle 1%nWidth: %.2f%nHeight: %.2f%nArea: %.2f%nPerimeter: %.2f", r1.getWidth(), r1.getLength(), r1.getArea(), r1.getPerimeter());
		System.out.printf("%n%nRectangle 2%nWidth: %.2f%nHeight: %.2f%nArea: %.2f%nPerimeter: %.2f", r2.getWidth(), r2.getLength(), r2.getArea(), r2.getPerimeter());
	}

}
