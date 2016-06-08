package com.poonia.core;

public class MinMaxArrayImpl<T extends Comparable<T>> implements MinMaxArray<T> {

	private T vals[];

	@SafeVarargs
	public MinMaxArrayImpl(T... vals) {
		this.vals = vals;
	}

	public T min() {
		// TODO Auto-generated method stub

		T min;

		min = vals[0];
		for (T val : vals) {

			if (val.compareTo(min) < 0)
				min = val;

		}

		return min;
	}

	public T max() {
		// TODO Auto-generated method stub

		T max;

		max = vals[0];
		for (T val : vals) {

			if (val.compareTo(max) > 0)
				max = val;

		}
		return max;
	}

	public static void main(String[] args) {

		MinMaxArray<Integer> intArray = new MinMaxArrayImpl<Integer>(200, 9,
				45, 67, 3000, 34, 2);
		System.out.println("min value in an int array: " + intArray.min());
		System.out.println("max value in an int array: " + intArray.max());

		MinMaxArray<Double> doubleArray = new MinMaxArrayImpl<Double>(2.0e2,
				0.99e92, 4.5, 6.7, 30.e3, 3.4, 2.2e3);
		System.out
				.println("min value in an Double array: " + doubleArray.min());
		System.out
				.println("max value in an Double array: " + doubleArray.max());

		MinMaxArray<Customer> CustomerArray = new MinMaxArrayImpl<Customer>(
				new Customer(1, "name1"), new Customer(2, "name2"),
				new Customer(3, "name3"), new Customer(4, "name1"));
		System.out.println("min value in an Double array: "
				+ CustomerArray.min());
		System.out.println("max value in an Double array: "
				+ CustomerArray.max());
	}
}
