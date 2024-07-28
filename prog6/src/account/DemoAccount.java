package account;


	public class DemoAccount {
	    public static void main(String[] args) {
	        SavingAccount savingAccount = new SavingAccount(1000, 5);
	        savingAccount.deposit(500);
	        savingAccount.withdraw(200);
	        savingAccount.addInterest();

	        CurrentAccount currentAccount = new CurrentAccount(1000, 500);
	        currentAccount.deposit(500);
	        currentAccount.withdraw(1200);
	    }
	}


