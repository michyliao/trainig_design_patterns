package creation.prototype.apps;

import creation.prototype.domains.*;

public class PrototypeClient {
	
	public static void main(String[] agrs){
		CreditCard card = new CreditCard();
		CardCache cache = new CardCache();
		System.out.println("OG Card : " + card.hashCode());
		cache.loadProduct(card);
		
		try {
			CreditCard cacheCard = cache.getCarchedCard();
			System.out.println("cached card : "+cacheCard.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
	}

}
