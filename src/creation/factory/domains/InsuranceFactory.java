package creation.factory.domains;

public class InsuranceFactory implements Factory {

	@Override
	public Insurance getInstance(int key) {
		switch (key) {
		case 1:
			return new LifeInsurance("BOB", 1000, "EN");
		case 2:
			return new HealthInsurance("TOB", 5000000, InsuranceType.FAMILYFLOATER);
		default:
			return new VehicleInsurance("MOB", 700000, VehicleInsturancePackages.VAN);
		}
	}


	
}
