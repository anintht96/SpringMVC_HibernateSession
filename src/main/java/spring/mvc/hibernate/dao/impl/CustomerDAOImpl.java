package spring.mvc.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.mvc.hibernate.dao.CustomerDAO;
import spring.mvc.hibernate.entities.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.update(customer);
	}

	@Override
	public void deleteCustomner(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(customer);
	}

	@Override
	public Customer findById(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	@Override
	public List<Customer> listCustomers() {
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("From Customer", Customer.class).getResultList();
	}

}
