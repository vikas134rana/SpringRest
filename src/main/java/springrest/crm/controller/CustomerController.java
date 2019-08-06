package springrest.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest.crm.entity.Customer;
import springrest.crm.exceptionhandling.CustomerNotFoundException;
import springrest.crm.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
	}

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable int id) throws CustomerNotFoundException {
		Customer customer = customerService.getCustomer(id);

		if (customer == null)
			throw new CustomerNotFoundException("Customer not found with id: " + id);

		return customer;
	}

	@PostMapping
	public void createCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		customerService.createCustomer(customer);
	}

	@PutMapping
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable int id) throws CustomerNotFoundException {
		Customer customer = customerService.getCustomer(id);

		if (customer == null)
			throw new CustomerNotFoundException("Cant perform delete operation. Customer not found with id: " + id);

		customerService.deleteCustomer(customer);
	}

}