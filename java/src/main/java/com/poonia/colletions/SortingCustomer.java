package com.poonia.colletions;

import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.poonia.core.Customer;

public class SortingCustomer {

	public static void main(String[] args) {

		Set<Customer> set = new TreeSet<Customer>();

		set.add(new Customer(1, "name1"));
		set.add(new Customer(2, "name2"));
		set.add(new Customer(3, "name3"));
		set.add(new Customer(4, "name4"));
		set.add(new Customer(5, "name5"));
		set.add(new Customer(6, "name6"));
		set.add(new Customer(7, "name7"));

		Iterator<Customer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println((iter.next()));
		}
	}

}
