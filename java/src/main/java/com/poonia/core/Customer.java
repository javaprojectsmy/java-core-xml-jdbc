package com.poonia.core;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer extends Object implements Comparable<Customer>,
		Serializable {
	private int customerNumber;
	private String customerName;

	// default constructor
	public Customer() {
	}

	public Customer(int customerNumber, String customerName) {

		this.customerNumber = customerNumber;
		this.customerName = customerName;

	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName="
				+ customerName + "]";
	}

	public int compareTo(Customer o) {
		return ((customerName).compareTo(o.getCustomerName()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + customerNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerNumber != other.customerNumber)
			return false;
		return true;
	}

}
