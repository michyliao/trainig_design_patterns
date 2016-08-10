package creation.decorator.domains;

public class MobileAccount extends FeatureDecorator {
	BankAccount account;

	/**
	 * @param account
	 */
	public MobileAccount(BankAccount account) {
		super(account);
		this.account = account;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 600;
	}

}
