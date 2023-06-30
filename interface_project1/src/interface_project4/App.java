package interface_project4;

public class App {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		
		System.out.println("open a current and savings account.");
		
		CurrentAccount currentAccount=new CurrentAccount(4000);
		SavingsAccount savingsAccount=new SavingsAccount(4000,4.5);
		
		bank.addAccount(savingsAccount);
		bank.addAccount(currentAccount);
		
		System.out.println("Amount Deposited successfully.");
		
		bank.showBalances();
		
		currentAccount.withdraw(1000);
		
		System.out.println("Withdraw successfully.");
		
		bank.showBalances();
		
		bank.deposit(currentAccount,3000);
		bank.deposit(savingsAccount,2000);
		
		
		savingsAccount.calcInterest();
		
		bank.showBalances();
		
		
		

	}

}
