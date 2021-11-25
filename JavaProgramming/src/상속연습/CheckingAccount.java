package 상속연습;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
	
		if (amount > this.balance) {
			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		} else {
			super.withdraw(amount);
		}
		return true;
	}
}
