package com.poonia.core;

public class TestCustomer {

	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		int age = Integer.parseInt(args[2]);
		Customer customer = new Customer(id, name);
		System.out.println("id" + customer.getCustomerNumber());
		System.out.println("name" + customer.getCustomerName());

	}

}
