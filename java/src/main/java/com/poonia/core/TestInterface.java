package com.poonia.core;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IterationImpl iter1=new IterationImpl(new Object[]{34,56.5,(short)5,false,
		//		"some string",1000000L,(byte)127});
		Iteration iter=new IterationImpl(new Object[]{34,56.5,(short)5,false,
		"some string",1000000L,(byte)127});
		while(iter.hasNext()){
			Object retVal=iter.next();
			System.out.println(retVal.getClass().getSimpleName()+" "+retVal);
		}
}
	

}
