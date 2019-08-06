package springrest.crm.dao;

import java.util.List;

import springrest.crm.entity.Customer;

public interface CustomerDao {

	List<Customer> getCustomersList();

	void createCustomer(Customer customer);
	
	Customer getCustomer(int id);

	void deleteCustomer(Customer customer);
}
