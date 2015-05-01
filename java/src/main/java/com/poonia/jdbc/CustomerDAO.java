package com.poonia.jdbc;

import java.util.List;

import com.poonia.core.Customer;

public interface CustomerDAO {

	void add(Customer customer);

	void update(Customer customer);

	void delete(int customerid);

	Customer findById(int customerid);

	List<Customer> findAll();

	int[] executeBatch(Customer customer[]);

}
