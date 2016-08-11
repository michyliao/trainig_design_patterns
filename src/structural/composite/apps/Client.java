package structural.composite.apps;

import structural.composite.domains.*;

public class Client {
	
	public static void main(String[] agrs){
		Store s1 = new Store(5000, "A");
		Store s2 = new Store(4000, "B");
		Store s3 = new Store(9000, "C");
		
		City toronto = new City("Toronto");
		
		toronto.addLeaf(s1);
		toronto.addLeaf(s2);
		toronto.addLeaf(s3);
		
		Store s4 = new Store(5000, "AA");
		Store s5 = new Store(4000, "BB");
		Store s6 = new Store(9000, "CC");
		
		City vancouver = new City("Vancouver");
		
		vancouver.addLeaf(s4);
		vancouver.addLeaf(s5);
		vancouver.addLeaf(s6);
		
		State canada = new State("Canada");
		
		canada.addLeaf(toronto);
		canada.addLeaf(vancouver);
		
		System.out.println("Total Collection := " + toronto.getCityName() + " " + toronto.getProfit());

		System.out.println("Total Collection := " + vancouver.getCityName() + " " + vancouver.getProfit());

		System.out.println("Total Collection := " + canada.getStateName() + " " + canada.getProfit());

		
	}

}
