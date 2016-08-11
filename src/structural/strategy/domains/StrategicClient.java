package structural.strategy.domains;

public class StrategicClient {

	public static void main(String[] args) {

		PatientContext patient1 = new PatientContext();
		
		patient1.setStrategy(new CardPayment());
		patient1.makePayment(5000);
		
		PatientContext patient2 = new PatientContext();
		patient2.setStrategy(new CashPayment());
		patient2.makePayment(10000);
	}

}
