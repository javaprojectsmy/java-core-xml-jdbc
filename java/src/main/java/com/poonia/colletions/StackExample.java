package com.poonia.colletions;
//import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

import com.poonia.core.Customer;


public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Customer>stack=new Stack<Customer>();
		stack.push(new Customer(1,"name1",23));
		stack.push(new Customer(2,"name1",33));
		stack.push(new Customer(3,"name1",43));
		stack.push(new Customer(4,"name1",53));
		System.out.println("Pop "+stack.pop());
		System.out.println("peek "+stack.peek());
		
		System.out.println("first element "+stack.firstElement());
		System.out.println("last element "+stack.lastElement());
		//Iterator<Customer>iter=stack.iterator();
		//while(iter.hasNext()){
		//	System.out.println(iter.next());
		//}
		ListIterator<Customer>iter=stack.listIterator();
		while(iter.hasNext()){
			iter.next();
		}
		while(iter.hasPrevious()){
			if(iter.previousIndex()==2){
				iter.remove();
				
			}
			System.out.println(iter.previous());
		}
	}

}
