package chap09;

public class Account {
	private int id; // default is 0
	private double balance; // default is 0
	private double annualInterestRate; // stores current interest rate, def. is 0
	
//	default constructor that creates default account
	
	public Account() {
		this(0, 0);
		setAnnualInterestRate(0);
	}
	
//	convenience constructor that creates account with specified id and initial balance
	
	public Account(int id, double balance) {
		setId(id);
		balance = balance;
	}
	
//	accessor methods for id, balance and annualInterestRate
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	
//	mutator methods for id, annualInterestRate
//	annual interest rate percentage will be divided by 100
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}
	
//	getMonthlyInterestRate() method returns monthly interest rate
//	monthly interest rate = annualInterestRate / 12
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
//	getMonthlyInterest() method that returns the monthly interest
//	monthly interest = balance * monthlyInterestRate
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
//	withdraw() method that withdraw a specified amount from the account
	
	public void withdraw(double amountWithdrawn) {
		this.balance =- amountWithdrawn;
	}
	
//	deposit() method that deposits a specified amount to the account
	public void deposit(double amountDeposited) {
		this.balance += amountDeposited;
	}
	
	
}
