package spring.mvc.hibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.hibernate.dao.CustomerDAO;
import spring.mvc.hibernate.entities.Customer;
import spring.mvc.hibernate.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomner(new Customer(id));
	}

	@Override
	public List<Customer> listCustomers() {
		return customerDAO.listCustomers();
	}

	@Override
	public Customer findById(int id) {
		return customerDAO.findById(id);
	}

}
