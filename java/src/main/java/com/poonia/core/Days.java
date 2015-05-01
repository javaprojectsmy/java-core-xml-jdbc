package com.poonia.core;

public enum Days {
	SUNDAY,MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY;
	
	public  static String getTaskForHoliday(Days days){
		
		
		switch (days) {
		case FRIDAY:
			return "GO for movie";
		   case SATURDAY:
			return "GO for party";
		  case SUNDAY:
			return "GO for sleep";
			default:
			return "GO TO WORK";
		}
	}

	public static void main(String args[]){
		System.out.println("task for holiday"+getTaskForHoliday(SATURDAY));
		System.out.println("value of "+Days.valueOf("SUNDAY"));
		for (Days day:Days.values()) {
			System.out.println(day);
			System.out.println("ordinal : "+Days.MONDAY.ordinal());
		}
		
	}
}
