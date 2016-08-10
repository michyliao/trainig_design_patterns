package creation.factory.domains;

enum VehicleInsturancePackages {
	SMALLCAR, VAN, SPORTSCAR
}

public class VehicleInsurance extends Insurance {

	VehicleInsturancePackages vPackage;

	/**
	 * @param policyHolderName
	 * @param policyAmount
	 * @param vPackage
	 */
	public VehicleInsurance(String policyHolderName, double policyAmount, VehicleInsturancePackages vPackage) {
		super(policyHolderName, policyAmount);
		this.vPackage = vPackage;
	}

	@Override
	public double calculatePremium() {
		double premium = 0.0;
		switch (vPackage) {
		case SMALLCAR:
			premium = 100.00;
			break;

		case VAN:
			premium = 500.00;
			break;
		case SPORTSCAR:
			premium = 1000.00;
			break;
		}
		return premium;
	}

}
