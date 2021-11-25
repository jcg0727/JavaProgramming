package 상속연습;

public class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public boolean withdraw(int amount) {
		balance -= amount;
		return true;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}

	@Override
	public String toString() {
		return "잔액" + balance;
	}
	
	
	
}
