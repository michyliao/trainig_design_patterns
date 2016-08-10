package creation.adapter.domains;

public class CreditCard {

	private double amountDue;
	
	/**
	 * @param amountDue
	 */
	public CreditCard(double amountDue) {
		super();
		this.amountDue = amountDue;
	}

	
	public double calculateMinimumAmount(){
		return amountDue * .05;
	}
	
}
