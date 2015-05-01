package com.poonia.colletions;

import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

import com.poonia.core.*;


public class ListInterface1 {

	public static void main(String[] args) {


		LinkedList<Customer >list=new LinkedList<Customer>();
		list.add(new Customer(1,"name1",23));
		list.add(new Customer(2,"name2",33));
		list.add(new Customer(3,"name3",13));
		list.add(new Customer(4,"name4",43));
		list.add(new Customer(5,"name5",53));
		list.add(new Customer(6,"name6",63));
		list.addFirst(new Customer(200,"name200",200));
		list.addLast(new Customer(75,"name75",75));
		System.out.println("size: "+list.size());
		System.out.println("remove: "+list.remove(2));
		System.out.println("set: "+list.set(4,new Customer(44,"name44",14)));
		System.out.println("contain: "+list.contains(new Customer(44,"name44",14)));
		
		
		ListIterator<Customer>li=list.listIterator();
		
		
		while(li.hasNext())
		{ if(li.nextIndex()==1){
				li.add(new Customer(100,"name100",100));
					}
		
		li.next();
		}
		
		
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
}
	
}

