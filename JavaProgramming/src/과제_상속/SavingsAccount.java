package 과제_상속;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		this.balance += this.balance * interestRate * period;
	}

}