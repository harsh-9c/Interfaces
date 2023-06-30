package interface_project4;

public class SavingsAccount implements Account {
	
	private double balance;
	private double interest;
	

	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
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
	
	public void calcInterest() {
		balance+=(balance*interest);
	}
	

}
