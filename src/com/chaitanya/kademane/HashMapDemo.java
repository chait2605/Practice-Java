package com.chaitanya.kademane;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		
		//create a hash map
		HashMap<Integer, String> firstMap = new HashMap<Integer, String>();
		
		//populate hash map
		firstMap.put(1,  "Chaitanya");
		firstMap.put(2,  "Arjuna");
		firstMap.put(3, "Mommy");
		
		//check existence of key 3
		System.out.println("Hello " +firstMap.get(3));
		
		
		
	}
}
