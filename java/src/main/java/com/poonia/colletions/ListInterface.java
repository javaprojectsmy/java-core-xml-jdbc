package com.poonia.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import com.poonia.core.*;

public class ListInterface {

	public static void main(String[] args) {

		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "name1"));
		list.add(new Customer(2, "name2"));
		list.add(new Customer(3, "name3"));
		list.add(new Customer(4, "name4"));
		list.add(new Customer(5, "name5"));
		list.add(new Customer(6, "name6"));
		Collections.sort(list, new Comparator<Customer>() {
			@SuppressWarnings("unused")
			public int compairTo(Customer o1, Customer o2) {
				return ((Integer) o1.getCustomerNumber()).compareTo(o2.getCustomerNumber());
			}

			@Override
			public int compare(Customer o1, Customer o2) {
				return 0;
			}
		});
		System.out.println("size: " + list.size());
		System.out.println("remove: " + list.remove(2));
		System.out.println("set: " + list.set(4, new Customer(44, "name44")));
		System.out.println("contain: " + list.contains(new Customer(44, "name44")));

		ListIterator<Customer> li = list.listIterator();

		while (li.hasNext()) {
			if (li.nextIndex() == 1) {
				// li.add(new Customer(100,"name100"));
			}

			li.next();
		}

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
