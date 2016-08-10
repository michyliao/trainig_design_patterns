package creation.adapter.domains;

public class AccountAdapter extends SavingAccount{

	private CreditCard card;
	
	
	
	/**
	 * @param card
	 */
	public AccountAdapter(CreditCard card) {
		super();
		this.card = card;
	}



	@Override
	public double calculate() {
		double totalDue = card.calculateMinimumAmount() + super.calculate();
		return totalDue;
	}

}
