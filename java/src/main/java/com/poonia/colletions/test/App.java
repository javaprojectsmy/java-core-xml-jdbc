package com.poonia.colletions.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class App {
	public static void main(String[] args) {

		ListIterator<Person> listIterator = getPersonList().listIterator();
		while (listIterator.hasNext()) {

			System.out.println(listIterator.next().getFirstName());
			System.out.println(listIterator.next().getLastName());
			System.out.println(listIterator.next().getId());
			System.out.println(listIterator.next().getDateOfbirth());

		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous().getFirstName());
			System.out.println(listIterator.previous().getLastName());
			System.out.println(listIterator.previous().getId());
			System.out.println(listIterator.previous().getDateOfbirth());
		}

	}

	public static List<Person> getPersonList() {
		List<Person> list1 = new ArrayList<Person>();
		list1.add(new Person(1, "rohtash", "poonia", "10-feb-2017"));
		list1.add(new Person(2, "vikash", "poonia", "11-feb-2017"));
		list1.add(new Person(3, "subash", "poonia", "12-feb-2017"));
		list1.add(new Person(4, "surender", "poonia", "13-feb-2017"));

		return list1;

	}

	public static List<Person> getPersonLinkedlist() {
		List<Person> list = new LinkedList<Person>();
		list.add(new Person(1, "rohtash", "poonia", "10-feb-2017"));
		list.add(new Person(2, "vikash", "poonia", "11-feb-2017"));
		list.add(new Person(3, "subash", "poonia", "12-feb-2017"));
		list.add(new Person(4, "surender", "poonia", "13-feb-2017"));

		return list;
	}
}
