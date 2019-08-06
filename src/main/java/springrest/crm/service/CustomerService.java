package springrest.crm.service;

import java.util.List;

import springrest.crm.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomers();
	
	void createCustomer(Customer customer);
	
	Customer getCustomer(int id);

	void deleteCustomer(Customer customer);

}
