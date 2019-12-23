
public class SalesRepresentative {
	private int sales;
	private int quota;
	private int revenue;
	
	
	public int getSales() {
		return sales;	
	}
	
	public void setSales(int sale) {
		sales = sale;
	}
	
	public int getQuota() {
		return quota;
	}
	
	public void setQuota (int quota) {
		this.quota = quota;
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	public void setRevenue (int revenue) {
		this.revenue = revenue;
	}
	public void calculateRevenue() {
		revenue = sales * quota;
	}
	
}

