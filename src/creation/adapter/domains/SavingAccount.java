package creation.adapter.domains;

public class SavingAccount extends BankAccount {

	public double getServiceCharge() {
		return 1000.00;
	}

	@Override
	public double calculate() {
		return getServiceCharge();
	}

}
