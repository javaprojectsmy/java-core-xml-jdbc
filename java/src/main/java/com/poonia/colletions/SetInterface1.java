package com.poonia.colletions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import com.poonia.core.*;

public class SetInterface1 {

	public static void main(String[] args) {

		LinkedList<Customer> list = new LinkedList<Customer>();
		list.add(new Customer(1, "name1"));
		list.add(new Customer(2, "name2"));
		list.add(new Customer(3, "name3"));
		list.add(new Customer(4, "name4"));
		list.add(new Customer(5, "name5"));
		list.add(new Customer(5, "name5"));
		list.addFirst(new Customer(200, "name200"));
		list.addLast(new Customer(75, "name75"));

		System.out.println("size: " + list.size());
		Set<Customer> set = new LinkedHashSet<Customer>();

		set.addAll(list);
		System.out.println("size of set: " + set.size());
		System.out.println("remove: " + set.remove(new Customer(4, "name4")));

		Iterator<Customer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
