package com.poonia.core;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int id=Integer.parseInt(args[0]);
  String name=args[1];
  int age=Integer.parseInt(args[2]);
  Customer customer =new Customer(id,name,age);
  System.out.println("id"+customer.getId());
  System.out.println("name"+customer.getName());
  System.out.println("age"+customer.getAge());
  
	}

}
