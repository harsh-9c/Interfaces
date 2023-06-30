package interface_project4;

import java.util.*;

public class Bank {
	
	private Vector<Account> vec = new Vector<Account>();  
	
	public void addAccount(Account account) {
        vec.add(account);
    }

    public void removeAccount(Account account) {
        vec.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
	
    public void showBalances() {
        for (Account account : vec) {
            System.out.println("Balance is "+account.viewBalance());
        }
    }
	
	


}
