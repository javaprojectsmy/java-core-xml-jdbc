package com.poonia.colletions.test;

public class Person {
	private String FirstName;
	private String LastName;

	public Person(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.FirstName= string;
		this.id=i;
		this.LastName= string2;
		this.DateOfbirth= string3;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfbirth() {
		return DateOfbirth;
	}

	public void setDateOfbirth(String dateOfbirth) {
		DateOfbirth = dateOfbirth;
	}

	private int id;
	private String DateOfbirth;
}
