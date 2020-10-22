package domain;

public class Customer {
	
	private long ID;
	private boolean isNew;
	private double total;
	
	public Customer(long ID, boolean isNew, double total) {
		this.ID = ID;
		this.isNew = isNew;
		this.total = total;
	}
	
	/**
	 * Ініціалізує атрибути початковими значеннями
	 */
	public Customer() {
		this(1, true, 1000.0D);
	}
	
	public void displayCustomerInfo() {
		System.out.println("ID: " + ID);
		System.out.println("Is new: " + isNew);
		System.out.println("Total purchases are: " + total);
	}
	
	public long getID() {
		return ID;
	}
	
	public void setID(long ID) {
		if (ID > 0)
			this.ID = ID;
	}
	
	public boolean isNew() {
		return isNew;
	}
	
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		if (total > 0)
			this.total = total;
	}
}
