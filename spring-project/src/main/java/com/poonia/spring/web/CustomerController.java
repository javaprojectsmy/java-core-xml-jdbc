package com.poonia.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poonia.spring.dao.CustomerSpringDAO;
import com.poonia.spring.model.Customer;

//http://127.0.0.1:8080/tesco/customer
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerSpringDAO customerDAO;

	// http://127.0.0.1:8080/tesco/customer/add
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addCustomerPage() {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("customer-add");
		modelAndView.addObject("customer", new Customer());
		return modelAndView;
	}

	// http://127.0.0.1:8080/tesco/customer/add
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	// @modelAttribute captures data and map it to the object
	public ModelAndView addingCustomerPage(@ModelAttribute Customer customer) {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("home");
		customerDAO.add(customer);
		modelAndView.addObject("message", "Customer successfully added");
		return modelAndView;
	}

	// http://127.0.0.1:8080/tesco/customer/add
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listOfCustomers() {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("customer-list");
		modelAndView.addObject("customers", customerDAO.findAll());
		return modelAndView;
	}

	// http://127.0.0.1:8080/tesco/customer/edit/1
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editCustomerPage(@PathVariable("id") Integer id) {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("customer-edit");
		modelAndView.addObject("customer", customerDAO.findById(id));
		return modelAndView;
	}

	// http://127.0.0.1:8080/tesco/customer/edit/1
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editingCustomerPage(@ModelAttribute Customer customer, @PathVariable("id") Integer id) {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("home");
		customerDAO.update(customer);
		modelAndView.addObject("message", "Customer Successfully Updated");
		return modelAndView;
	}

	// http://127.0.0.1:8080/tesco/customer/delete/1
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteCustomerPage(@PathVariable("id") Integer id) {
		// customer-add is the name of the jsp
		ModelAndView modelAndView = new ModelAndView("home");
		customerDAO.delete(id);
		modelAndView.addObject("message", "Customer Successfully Deleted");
		return modelAndView;
	}
}
