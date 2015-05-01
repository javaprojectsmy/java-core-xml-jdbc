package com.poonia.core;

public class TestAbstraction {

	
	public static void Display(Shape shape){
		System.out.println(" Area of: "+shape.getClass().getSimpleName()+ " is "+shape.calculateArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape rectangle=new Rectangle(23.4,34.5);
     Display(rectangle);
     Shape triangle=new Triangle(23.4,34.5);
     Display(triangle);
     
	}

}
