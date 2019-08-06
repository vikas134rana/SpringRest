package springrest.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springrest.crm.dao.CustomerDao;
import springrest.crm.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomersList();
	}

	@Transactional
	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
	}

	@Transactional
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);
	}

}
