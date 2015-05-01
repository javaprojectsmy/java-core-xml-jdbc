package com.poonia.jdbc;

import com.poonia.core.Customer;

public class TestJDBC1 {

	public static void main(String[] args) {

		try {
			CustomerDAO dao = new CustomerDAOImpl();
			// dao.add(new Customer(100,"name",100));
			//dao.delete(1);
			// dao.findById(1);
//			dao.executeBatch(new Customer[] { 
//					new Customer(49, "name49"),
//					new Customer(50, "name50"),
//					new Customer(51, "name51"),
//					new Customer(52, "name52") });
			for (Customer c : dao.findAll()) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
