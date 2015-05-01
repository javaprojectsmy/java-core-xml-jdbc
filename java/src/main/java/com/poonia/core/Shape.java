package com.poonia.core;

public abstract class Shape {

	private double width,height;
	public Shape(double width,double height){
		
		this.width=width;
		this.height=height;
	}
	
	public double getWidth(){
		return width;
	}
	public void  SetWidth(double width){
		this.width=width;
	}
	public double getHeight(){
		return height;
	}
	public void SetHeight(double height){
		this.height=height;
	}
	
	public abstract double calculateArea();
	//encapsulation is implementation of behaviour 
}
