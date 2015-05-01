package com.poonia.colletions;

import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.poonia.core.Customer;

public class SortingCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Customer>set=new TreeSet<Customer>();
		    
		    set.add(new Customer(1,"name1",23));
		    set.add(new Customer(2,"name2",45));
		    set.add(new Customer(3,"name3",23));
		    set.add(new Customer(4,"name4",23));
		    set.add(new Customer(5,"name5",23));
		    set.add(new Customer(6,"name6",22));
		    set.add(new Customer(7,"name7",23));
		    
		    
		    Iterator<Customer> iter=set.iterator();
		    while(iter.hasNext()){
		    	System.out.println((iter.next()));
		    }
	}

}
