package creation.decorator.apps;

import creation.decorator.domains.*;

public class DecoratorClient {
	
	public static void main(String[] args){
		SavingAccount acc = new SavingAccount();
		
		BankAccount bacc = new NetBanking(new SavingAccount());
		
		BankAccount bacc2 = new MobileAccount(new NetBanking(new SavingAccount()));
	}

}
