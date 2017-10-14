package com.poonia.colletions.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateFormats {
  
  public static void main(String args[]) throws ParseException{
	  Date date = new Date();
	  System.out.println("normal date format to string"+date.toString());
	  String dateFormatString = "hh:mm:ss a dd-MM-yyyy";
	  SimpleDateFormat  dateFormat = new SimpleDateFormat(dateFormatString);
	  
	  System.out.println("simple date format: "+dateFormat.format(date));
	  
	  
	  //compairing the dates 
	  SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
	  Date dt_1 = objSDF.parse("20-08-1981");
	  Date dt_2 = objSDF.parse("12-10-2012");
	   
	  System.out.println("Date1 : " + objSDF.format(dt_1));
	  System.out.println("Date2 : " + objSDF.format(dt_2));
	   
	  if (dt_1.compareTo(dt_2)>0){
	  System.out.println("Date 1 occurs after Date 2");
	  }// compareTo method returns the value greater than 0 if this Date is after the Date argument.
	   
	  else if (dt_1.compareTo(dt_2)<0){
	  System.out.println("Date 1 occurs before Date 2");
	  }// compareTo method returns the value less than 0 if this Date is before the Date argument;
	   
	  else if (dt_1.compareTo(dt_2)==0){
	  System.out.println("Both are same dates");
	  }// compareTo method returns the value 0 if the argument Date is equal to the second Date;
	  else{
	  System.out.println("You seem to be a time traveller !!");
	  }
	  
  }
}
