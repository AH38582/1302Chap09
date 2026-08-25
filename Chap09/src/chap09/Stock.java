package chap09;

public class Stock {
//	Data Fields
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice;
	private double currentPrice;

//	Default Constructor
	Stock() {
		previousClosingPrice = 0;
		currentPrice = 0;
	}
	
//	Convenience Constructor
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

//	Getter/Setter

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

//	Method
	public double getChangePercent() {
		return this.previousClosingPrice - this.currentPrice;
	}
	

}
