package creation.adapter.apps;

import java.nio.channels.AcceptPendingException;

import creation.adapter.domains.*;

public class AdapterClient {

	public static void main(String[] agrs){
		CreditCard card = new CreditCard(45000.00);
		AccountAdapter adapter = new AccountAdapter(card);
		
		System.out.println("Total Amount Due" + adapter.calculate());
		
		
		
	}
	
}
