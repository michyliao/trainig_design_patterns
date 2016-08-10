package creation.decorator.domains;

public class NetBanking extends FeatureDecorator {

	
	/**
	 * @param account
	 */
	public NetBanking(BankAccount account) {
		super(account);
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 100 + super.balanceToMaintain();
	}

}
