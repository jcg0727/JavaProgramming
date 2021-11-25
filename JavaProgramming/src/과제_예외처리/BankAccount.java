package 과제_예외처리;

public class BankAccount {

	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public boolean withdraw(int amount) {
		this.balance -= amount;
		return true;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount < 0 || amount > balance) {
			throw new IllegalArgumentException();
		}else if(otherAccount == null) {
			throw new NullPointerException();
		}
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}

	@Override
	public String toString() {
		return String.format("%,d", this.balance);
	}
	
}