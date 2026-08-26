package chap09;

public class AccountTest {

	public static void main(String[] args) {
//		Create account object with account id of 1122, balance of 20,000
		Account ac = new Account(1122, 20000.0);
		
//		set annual interest to 4.5%
		ac.setAnnualInterestRate(4.5);
		
//		Use withdraw method to withdraw 2,500
		ac.withdraw(2500);
		
//		Use deposit method to deposit 3,000
		ac.deposit(3000);
		
//		print the balance, monthly interest and the date
		
		System.out.printf("Your balance is $%,f%nYour monthly interest is $%,f%n", ac.getBalance(), ac.getMonthlyInterest());
		

	}

}
