package com.poonia.spring.dao;

import java.util.List;

import com.poonia.spring.model.Customer;

public interface CustomerSpringDAO {
	
	void add(Customer customer);
	void update(Customer customer);
	void delete(int customerid);
	Customer findById(int customerid);
	
	List<Customer> findAll();
	
	int [] executeBatch(Customer customer[]);

}
