
public class DateTest {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		
		date.setTime(1000);
		date.setTime(10000);
		date.setTime(100000);
		date.setTime(1000000);
		date.setTime(10000000);
		date.setTime(100000000);
		date.setTime(1000000000);
		
		System.out.println(date.toString());
	}

}
