package spring.mvc.hibernate.service;

import java.util.List;

import spring.mvc.hibernate.entities.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public List<Customer> listCustomers();
	
	public Customer findById(int id);
}
