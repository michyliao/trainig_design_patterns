package creation.prototype.domains;

public class CreditCard implements Cloneable{
	
	private long cardNumber;
	private String cardHolderName;
	private String creditRating;
	private double creditLimit;
	
	
	/**
	 * 
	 */
	public CreditCard() {
		super();
	}


	/**
	 * @param cardNumber
	 * @param cardHolderName
	 * @param creditRating
	 * @param creditLimit
	 */
	public CreditCard(long cardNumber, String cardHolderName, String creditRating, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditRating = creditRating;
		this.creditLimit = creditLimit;
	}


	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}


	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}


	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


	/**
	 * @return the cardNumber
	 */
	public long getCardNumber() {
		return cardNumber;
	}


	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}


	/**
	 * @return the creditRating
	 */
	public String getCreditRating() {
		return creditRating;
	}


	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
