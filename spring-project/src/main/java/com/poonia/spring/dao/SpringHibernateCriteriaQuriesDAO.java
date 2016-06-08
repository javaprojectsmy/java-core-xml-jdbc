package com.poonia.spring.dao;

import java.util.Date;
import java.util.List;

import com.poonia.spring.model.Customer;

public interface SpringHibernateCriteriaQuriesDAO {
	List<Customer> findAll();

	List<Customer> pagination();

	Date projections();

	void criteria1();
}
