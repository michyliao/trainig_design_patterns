package creation.prototype.domains;

public class CardCache {

	private CreditCard card;
	
	public void loadProduct(CreditCard card){
		this.card = card;
	}
	
	public CreditCard getCarchedCard() throws CloneNotSupportedException{
		
		
		CreditCard card2 = (CreditCard) card.clone();
		card2.setCreditLimit(card.getCreditLimit()+999);
		
		return card2;
	}

	/**
	 * @return the card
	 */
	public CreditCard getCard() {
		return card;
	}
	
}
