package creation.factory.domains;

public abstract class Insurance {

	private String policyHolderName;
	private double policyAmount;
	
	/**
	 * @param policyHolderName
	 * @param policyAmount
	 */
	public Insurance(String policyHolderName, double policyAmount) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}

	/**
	 * @return the policyHolderName
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
	}

	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}

	public abstract double calculatePremium();
}
