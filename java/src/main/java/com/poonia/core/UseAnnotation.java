package com.poonia.core;

public class UseAnnotation {

	@Inject(value="minMaxArrayImpl")
	private MinMaxArray<?>minMaxArray;
	
	public void setMinMaxArray(MinMaxArray<?> minMaxArray ){
		this.minMaxArray=minMaxArray;
	}
	public void Display(){
		System.out.println("min value in array "+minMaxArray.min());
		System.out.println("max value in array "+minMaxArray.max());
	}
}
