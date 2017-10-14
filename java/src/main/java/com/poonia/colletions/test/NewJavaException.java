package com.poonia.colletions.test;

class NewJavaException{
	   public static void main(String args[]){
	  try{
	       throw new MyException(2);
	       // throw is used to create a new exception and throw it.
	  }
	 catch(MyException e){
	    System.out.println(e) ;
	 }
	}
	}
	class MyException extends Exception{
	   int a;
	   MyException(int a) {
	     this.a=a;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	}