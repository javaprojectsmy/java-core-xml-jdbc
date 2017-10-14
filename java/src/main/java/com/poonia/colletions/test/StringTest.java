package com.poonia.colletions.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rohan is a star";
		String str1 = " are you serious";
		System.out.println("first version of string " + str);
		System.out.println("does string contain star word : " + str.contains("star"));
		System.out.println("does sting contains a : " + str.contains("a"));
		System.out.println("is the string are equals :" + str.equals("rohan is a star"));
		System.out.println("ignorecase is the strings are equals : " + str.equalsIgnoreCase("rohan is a star"));
		System.out.println("charcter value at index 5 : " + str.charAt(5));
		System.out.println("character a at which index " + str.indexOf("a"));
		System.out.println("index of susstring ;" + str.indexOf("star"));
		System.out.println("String after concatination");
		str = str + str1;
		System.out.println(str);

		System.out.println("is tring ends with ous :" + str.endsWith("ous"));
		System.out.println("is string end with tar " + str.endsWith("tar"));
		System.out.println("replace all a with b " + str.replace("a", "b"));
		System.out.println(str);
		str = str.replace("a", "b");
		System.out.println(str);

		System.out.println("replace stbr to star " + str.replace("stbr", "star"));
		System.out.println(str);

		String str2 = "100";
		int itest = Integer.parseInt(str2);
		System.out.println(itest);
		// System.out.println("arethmetic operation on parsed data"+ (itest/4));
	}

}
