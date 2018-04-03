package com.chaitanya.kademane;

import java.util.*;

public class HashMapDetailedDemo {
	
	public static void main(String[] args) {
		
		//create a hashmap
		HashMap<String, String> newHashMap = new HashMap<>();
		
		//adding values to hashmap as ("keys", "values")
		newHashMap.put("name", "Chaitanya");
		newHashMap.put("country", "India");
		newHashMap.put("university", "SJSU");
		newHashMap.put("course", "Software Engineering");
		
		System.out.println("Name:" +newHashMap.get("name"));
		System.out.println("Country:" +newHashMap.get("country"));
		System.out.println("University:" +newHashMap.get("university"));
		System.out.println("Course:" +newHashMap.get("course"));
		
		
		//.entrySet() returns all the keys and values present in HashMap
		Set<Map.Entry<String, String>> mappingDetails = newHashMap.entrySet();
		System.out.println("Set of keys and values using entrySet() : " +mappingDetails);
		System.out.println();
		
		//using .getOrDefault to access value
		System.out.println("Using .getOrDefault : " +newHashMap.getOrDefault("country", "USA"));
		
		//if a key or value is not present
		System.out.println("Using .getOrDefault : " +newHashMap.getOrDefault("Search", "USA"));
		
		System.out.println();
		
		//.replace() method to replace a value of a key
		newHashMap.replace("course", "Computer Software Engineering");
		System.out.println("Working of .replace() : " +mappingDetails);
		System.out.println();
		
		// .putIfAbsent adds a new key-value to the hashmap
		newHashMap.putIfAbsent("street", "101 San Fernando");
		System.out.println("Working of .putIfAbsent : " +mappingDetails);
		System.out.println();
		
		//.putIfAbsent wont do anything if the Key is already present
		newHashMap.putIfAbsent("country", "China");
		System.out.println("Non-working of putIfAbsent : " +mappingDetails);
		
	}
}
