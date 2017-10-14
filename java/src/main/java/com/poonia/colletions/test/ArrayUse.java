package com.poonia.colletions.test;

/** * @author I318422 * */
public class ArrayUse {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr1[] = new int[10];
		String str[] = new String[20];

		for (int i = 0; i < 8; i++) {
			arr[i] += i;
		}
		for (int i = 0; i < 21; i++) {
			try {
				str[i] = "a" + i;
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("array out of index exception occured");
			}

		}
		for (int a : arr) {
			System.out.println(a);
		}
		for (String a : str) {
			System.out.println(a);
		}

		String[] b = { "Apple", "Mango", "Orange" };
		System.out.println("Before Function Call    " + b[0]);
		ArrayUse.passByReference(b);
		System.out.println("After Function Call    " + b[0]);
	}

	public static void passByReference(String a[]) {
		a[0] = "Changed";
	}

}
