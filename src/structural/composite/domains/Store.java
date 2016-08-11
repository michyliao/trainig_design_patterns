package structural.composite.domains;

public class Store implements Profitable {
	private double profit;
	private String storeName;
	
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return storeName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.storeName = cityName;
	}

	/**
	 * @param profit the profit to set
	 */
	public void setProfit(double profit) {
		this.profit = profit;
	}
	

	@Override
	public double getProfit() {
		return profit;
	}
	
	

	/**
	 * @param profit
	 * @param cityName
	 */
	public Store(double profit, String cityName) {
		super();
		this.profit = profit;
		this.storeName = cityName;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub
		
	}
	

}
