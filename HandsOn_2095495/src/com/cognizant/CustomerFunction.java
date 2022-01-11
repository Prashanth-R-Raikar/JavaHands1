package com.cognizant;

import java.util.List;

public interface CustomerFunction {
	public int addCustomerDetails(CustomerDetails customer);
	public List<CustomerDetails> getAllCustomerDetails();
	public List<CustomerDetails> getCustomerDetailsByDate();
	public int updateCustomerDetails(CustomerDetails customer);
	public int bookCustomerRoom();

}
