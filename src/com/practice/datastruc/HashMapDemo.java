package com.practice.datastruc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//create a new hashmap
		HashMap<String, Double> hmap = new HashMap<String, Double>();
		
		//put elements into the map
		hmap.put("Zara", new Double(3434.34));
		hmap.put("Arjun", new Double(1378.00));
		hmap.put("Chaitanya", new Double(99.22));
		hmap.put("Shila", new Double(123.22));
		
		//Get a set of the entries
		Set entries = hmap.entrySet();
		
		//Get an iterator
		Iterator i = entries.iterator();
		
		//Display elements
		while(i.hasNext()) {
			
			Map.Entry mentry = (Map.Entry)i.next();
			
			System.out.print(mentry.getKey()+" :");
			System.out.println(mentry.getValue());
			
			
			
		}
		
		System.out.println();
		
		//deposit 100 into Zara's account
		double balance = ((Double)hmap.get("Zara")).doubleValue();
		hmap.put("Zara", new Double(balance+1000));
		System.out.println("Zara's new balance: " + hmap.get("Zara"));
		
		
		
	}

}
