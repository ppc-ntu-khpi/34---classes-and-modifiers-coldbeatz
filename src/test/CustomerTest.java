package test;

import domain.Customer;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setID(10);
		customer.setNew(false);
		customer.setTotal(100.5);
		
		customer.displayCustomerInfo();
	}
}
