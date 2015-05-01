package com.poonia.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import com.poonia.core.Customer;


public class ObjectSerialization {

	public static void main(String[] args) {


		 Map<Integer,Customer>map=new LinkedHashMap<Integer,Customer>();
		    map.put(1,new Customer(1,"name1",23));
		    map.put(2,new Customer(2,"name2",33));
		    map.put(3,new Customer(3,"name3",43));
		    map.put(4,new Customer(4,"name4",53));
		    map.put(5,new Customer(5,"name5",63));

		    try(FileOutputStream fos=new FileOutputStream("tmp.obj");
		    		ObjectOutputStream oos=new ObjectOutputStream(fos)){
		    	oos.writeObject(map);
		    	 System.out.println(map);
		    }
		    catch(IOException e){
		    	e.printStackTrace();
		    }
	}

}
