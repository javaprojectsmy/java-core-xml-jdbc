package com.poonia.core;

public class Triangle extends Shape {

	public Triangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * getWidth() * getHeight();
	}

}
