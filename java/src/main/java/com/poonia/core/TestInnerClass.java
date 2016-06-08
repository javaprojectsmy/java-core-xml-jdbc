package com.poonia.core;

public class TestInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer(new Object[] { 45, 67, 79, 90 });
		outer.iterate();
	}

}
