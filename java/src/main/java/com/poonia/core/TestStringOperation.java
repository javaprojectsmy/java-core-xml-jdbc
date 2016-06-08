package com.poonia.core;

public class TestStringOperation {

	public static void stringOperation1() {
		String s1 = "string object1 ";
		String s2 = new String("String object 2 ");
		String s3 = s1 + s2;
		char c[] = { 'w', 'x', 'y', 'z', ' ' };
		String s4 = new String(c);
		String s5 = s3 + s4;
		System.out.println(s5);
	}

	public static void stringOperation2() {
		String msg = "test this string for testing this";
		System.out.println("first occurance of this :" + msg.indexOf("this"));
		System.out.println("first occurance of this from 6th onwords :"
				+ msg.indexOf("this", 6));
		System.out
				.println("last occurance of this :" + msg.lastIndexOf("this"));
	}

	public static void stringOperation3() {
		String s[] = { "www.tesco.com", "http://tesco.com" };
		for (String string : s) {
			if (string.matches("^www\\.(.+)")) {
				System.out.println(string + "string starts with www");
			} else {
				System.out.println(string + "does not  starts with www");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringOperation1();// direct call bcoz it static method
		stringOperation2();
		stringOperation3();
	}

}
