package com.poonia.colletions.test;

import java.util.ArrayList;

/**
 * @author I318422
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Object> arrayList = new ArrayList();
    arrayList.add("asds");
    arrayList.add("dsjdjsdjsjd");
    arrayList.add(1, " rohtash ");
    System.out.println("print arrayList directly "+arrayList);
    System.out.println("print the size of arrayList "+arrayList.size());
    System.out.println("can it check if arraylist contains substring ds in it "+arrayList.contains("ds"));
	System.out.println("does it recognize some specific string in it " + arrayList.contains(" rohtash "));
	// some questions it doesn't gives result for substing og an index
	// it doesn't igone space 
	// it doesn't ignore uppercase ot lowercase
	}

}
