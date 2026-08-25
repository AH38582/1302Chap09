
public class StockTest {

	public static void main(String[] args) {
//		Instantiate object
		Stock s1 = new Stock("ORCL", "Oracle");
		
		
//		Set value
		s1.setPreviousClosingPrice(34.5);
		s1.setCurrentPrice(34.45);
		
//		Print
		System.out.println(s1.getChangePercent());
	}

}
