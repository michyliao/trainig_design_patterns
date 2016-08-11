package structural.composite.domains;

import java.util.ArrayList;
import java.util.List;

public class City implements Profitable {

	private String cityName;
	private List<Profitable> stores;

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *          the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the stores
	 */
	public List<Profitable> getStores() {
		return stores;
	}

	/**
	 * @param stores
	 *          the stores to set
	 */
	public void setStores(List<Profitable> stores) {
		this.stores = stores;
	}
	
	

	/**
	 * @param cityName
	 * @param stores
	 */
	public City(String cityName) {
		super();
		this.cityName = cityName;
		stores = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
		double profit = 0;
		for (Profitable obj : stores) {
			profit += obj.getProfit();
		}
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		if (child instanceof Store) {
			stores.add(child);
		}
	}

	@Override
	public void removeLeaf(Profitable child) {
		if (child instanceof Store){
			stores.remove(child);
		}
	}

}
