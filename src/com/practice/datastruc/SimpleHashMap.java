package com.practice.datastruc;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class SimpleHashMap {
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("one", "1");
		hmap.put("two", "2");
		hmap.put("three", "3");
		
		Collection collec = hmap.values();
		Iterator itr = collec.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

	
}
