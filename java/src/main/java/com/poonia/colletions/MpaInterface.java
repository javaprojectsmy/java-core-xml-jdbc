package com.poonia.colletions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import com.poonia.core.*;

public class MpaInterface {

	public static void main(String[] args) {
    Map<Integer,Customer>map=new LinkedHashMap<Integer,Customer>();
    map.put(1,new Customer(1,"name1"));
    map.put(2,new Customer(2,"name2"));
    map.put(3,new Customer(3,"name3"));
    map.put(4,new Customer(4,"name4"));
    map.put(5,new Customer(5,"name5"));
    
    System.out.println("Contain key :"+map.containsKey(2));
    System.out.println("Contain value:"+map.containsValue(4));
   // System.out.println("replace :"+((Object) map).replace(4,new Customer(4,"name4",53),new Customer(44,"name44",43)));
    System.out.println("remove :"+map.remove(2));
    
    Set<Integer> set =map.keySet();
    Iterator<Integer> iter=set.iterator();
    while(iter.hasNext()){
    	System.out.println(map.get(iter.next()));
    }
	}

}
