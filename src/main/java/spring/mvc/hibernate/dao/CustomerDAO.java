package spring.mvc.hibernate.dao;

import java.util.List;

import spring.mvc.hibernate.entities.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomner(Customer customer);
	
	public Customer findById(int id);
	
	public List<Customer> listCustomers();
}
