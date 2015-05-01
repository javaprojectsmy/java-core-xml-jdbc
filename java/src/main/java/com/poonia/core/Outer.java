package com.poonia.core;

public class Outer {
	 private Object objects[];
	 public Outer(Object objects[]){
		 this.objects=objects;
		 
	 }
	 public void iterate(){
		 
		 Inner inner=new Inner();
		 while(inner.hasNext()){
			 System.out.println(inner.next());
		 }
	 }
  private class Inner{
	  
	   
	  int i=0;
	
	  public boolean hasNext() {
			// TODO Auto-generated method stub
			if(objects==null)
				return false;
		  
			return i<=objects.length-1;
		}

	
		public Object next() {
			Object obj=objects[i];
			i++;
			return obj;
		}
  }
	
}
