package com.poonia.colletions.test;

import java.lang.reflect.Modifier;

public class GetClassMetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class<MyBaseClass> baseClass = MyBaseClass.class;
		System.out.println("get the name of class"+baseClass.getName());
		System.out.println("get the name of super class"+baseClass.getSuperclass().getName());
		
		Class[] allInterface = baseClass.getInterfaces();
		
		System.out.println("all interface of class");
		for(Class interace :allInterface){
			System.out.println("interface names"+interace.getName());
		}
       int allModifiers = baseClass.getModifiers();
       System.out.println("print all modifiers : "+Modifier.toString(allModifiers));
	}

}
