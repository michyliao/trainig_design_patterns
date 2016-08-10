package creation.factory.domains;

public class LifeInsurance extends Insurance {

	private String policyCode;

	public LifeInsurance(String policyHolderName, double policyAmount, String policyCode) {
		super(policyHolderName, policyAmount);
		this.policyCode = policyCode;
	}

	@Override
	public double calculatePremium() {
		double premium = 0.0;
		if (policyCode.equals("EN")) {
			premium = (getPolicyAmount() * 2000) / 12;
		} else {
			premium = (getPolicyAmount() * 2500) / 12;
		}
		return premium;
	}

}
