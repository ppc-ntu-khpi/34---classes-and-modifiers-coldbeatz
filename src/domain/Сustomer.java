package domain;

public class Сustomer {
	
	private long ID = 1;
	private boolean isNew = true;
	private double total = 1000.0D;
	
	public void displayCustomerInfo() {
		System.out.println("ID: " + ID);
		System.out.println("Is new: " + isNew);
		System.out.println("Total purchases are: " + total);
	}
}
