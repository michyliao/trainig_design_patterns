package creation.decorator.domains;

public class FeatureDecorator extends BankAccount {
	private BankAccount account;

	/**
	 * @param account
	 */
	public FeatureDecorator(BankAccount account) {
		super();

		this.account = account;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 90000;
	}

}
