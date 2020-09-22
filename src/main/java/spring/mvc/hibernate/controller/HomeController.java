package spring.mvc.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.hibernate.entities.Customer;
import spring.mvc.hibernate.service.CustomerService;

@Controller
public class HomeController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = {"/","/customer-list"})
	public ModelAndView listCustomer(@ModelAttribute(value = "customer")Customer customer) {
		return new ModelAndView("customer-list", "list", customerService.listCustomers()); 
	}
	
	@RequestMapping(value = "/customer-save",method = RequestMethod.GET)
	public ModelAndView getSaveCustomer(@ModelAttribute(value = "customer")Customer customer) {
		return new ModelAndView("customer-save");
	}
	
	@RequestMapping(value = "/customer-save",method = RequestMethod.POST)
	public ModelAndView postSaveCustomer(@ModelAttribute(value = "customer")Customer customer) {
		customerService.addCustomer(customer);
		return new ModelAndView("redirect:/customer-list");
	}
	
	@RequestMapping(value = "/customer-view/{id}",method = RequestMethod.GET)
	public ModelAndView viewCustomer(@PathVariable(value = "id")int id) {
		return new ModelAndView("customer-view", "view", customerService.findById(id));
	}
	
	@RequestMapping(value = "/customer-update/{id}",method = RequestMethod.GET)
	public ModelAndView getUpdateCustomer(@ModelAttribute(value = "customer")Customer customer,@PathVariable(value = "id")int id) {
		return new ModelAndView("customer-update","customer",customerService.findById(id));
	}
	
	@RequestMapping(value = "/customer-update",method = RequestMethod.POST)
	public ModelAndView postUpdateCustomer(@ModelAttribute(value = "customer")Customer customer) {
		customerService.updateCustomer(customer);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/customer-delete/{id}",method = RequestMethod.GET)
	public ModelAndView delateCustomer(@PathVariable(value = "id")int id) {
		customerService.deleteCustomer(id);
		return new ModelAndView("redirect:/");
	}
}
