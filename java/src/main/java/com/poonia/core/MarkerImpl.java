package com.poonia.core;

public class MarkerImpl implements Marker {
   public void checkInterface() throws InterfaceException{
	   //finding out that check interface method  is instance of Marker interface
	   // 
	   if(this instanceof Marker)
	   {
		   System.out.println("i implemented");
	   }
	   else
		 //  System.out.println("not impl");
	   throw new InterfaceException("interface not implemented");
   }
	
	public static void main(String ar[]){
		
		MarkerImpl marker= new MarkerImpl();
		try{
		marker.checkInterface();
		}
		catch(InterfaceException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("inside finally block");
		}
	}
	
	
	
	
}
