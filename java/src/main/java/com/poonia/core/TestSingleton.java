package com.poonia.core;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1= Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		System.out.println("object1.equals(object 2) "+obj1.equals(obj2));
		
	}

}
