package structural.strategy.domains;

public class PatientContext {

	PaymentStrategy strategy;

	/**
	 * @param strategy
	 *          the strategy to set
	 */
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void makePayment(double amount) {
		strategy.pay(amount);
	}
}
