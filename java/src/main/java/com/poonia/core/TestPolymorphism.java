package com.poonia.core;

public class TestPolymorphism {

	public static void main(String[] args) {

		// testing polymorphism
		Object c1 = new Customer(1, "ram");
		Object c2 = new Customer(2, "vikash");
		Object c3 = new Customer(1, "ram");
		System.out.println("c1.equals(c1) " + c1.equals(c1));
		System.out.println("c1.equals(c3) " + c1.equals(c3));
		System.out.println(" c1.equals(c2)" + c1.equals(c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
