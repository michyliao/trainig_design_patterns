package creation.factory.apps;

import creation.factory.domains.*;

public class FactoryClient {
	
	public static void main(String[] agrs){
		Factory factory = new InsuranceFactory();
		Insurance insurance = (Insurance)factory.getInstance(2);
		System.out.println(insurance.calculatePremium());
		
		Insurance in = InsuranceStaticFactory.getInstance(3);
		System.out.println(in.calculatePremium());
		
		
	}

}
