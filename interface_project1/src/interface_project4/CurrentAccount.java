package interface_project4;

public class CurrentAccount implements Account {
	
	private double balance;
	

	public CurrentAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
	}

	@Override
	public void withdraw(double amount) {
		balance-=amount;
	}

	@Override
	public double viewBalance() {
		return balance;	
	}
	

}
