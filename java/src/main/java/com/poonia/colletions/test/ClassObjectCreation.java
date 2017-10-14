package com.poonia.colletions.test;

public class ClassObjectCreation {
  
   
   public static void main(String args[]) throws ClassNotFoundException{
	   Class c1 = Class.forName("ClassObjectCreation");
	   ClassObjectCreation classObj = new ClassObjectCreation();
	   Class c2 = classObj.getClass();
	   Class c3 = ClassObjectCreation.class;
	   
   }
}
