package com.poonia.core;

public final class ImmutablePattern {

	
	private final java.util.Date reminder;
	public ImmutablePattern (java.util.Date reminder){
	   if(reminder.getTime()<System.currentTimeMillis()){
		   throw new IllegalArgumentException("cannot set time for past"+ reminder);
		   
			   
	   }
	   else System.out.println( "time is set");
	   this.reminder=new java.util.Date(reminder.getTime());
	}
	public java.util.Date getReminder(){
		return(java.util.Date) reminder.clone();
	}
	public static void main(String args[]){
		ImmutablePattern obj1=new ImmutablePattern(new java.util.Date());
		obj1.getReminder().setTime(System.currentTimeMillis()+1);
		
	}
}
