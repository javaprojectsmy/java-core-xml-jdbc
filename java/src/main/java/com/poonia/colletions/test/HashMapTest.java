package com.poonia.colletions.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		HashMap<Integer, String> hasMap1 = new HashMap<Integer, String>();

		map.put("rkp", "Rohtash Poonia");
		map.put("vkp", "Vikash Poonia");

		System.out.println(
				"get first map value for key rkp : " + map.get("rkp") 
				+ " get value for key vkp :" + map.get("vkp"));
		System.out.println("print map directly "+map);
        System.out.println("what all keys it has "+ map.keySet());
        System.out.println("what all vlaues its has " +map.values());
        System.out.println("does is contain the key "+ map.containsKey("rkp"));
		map1.put(1, "Rohtash Poonia");
		map1.put(2, "Vikash Poonia");

	}

}
