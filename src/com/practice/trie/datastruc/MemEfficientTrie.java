package com.practice.trie.datastruc;

import java.util.HashMap;
import java.util.Map;

public class MemEfficientTrie {
	
	boolean isLeaf;
	Map<Character, MemEfficientTrie> children;
	
	//constructor
	MemEfficientTrie(){
		
		isLeaf = false;
		
		children = new HashMap<>();
	
	}
	
	//iterative function to insert a string into trie ds
	public void insert(String key) {
		
		System.out.println("Inserting: " +key);
		
		//start from root node
		MemEfficientTrie curr =this;
		
		for(int i =0 ; i < key.length();i++) {
			
			if(curr.children.get(key.charAt(i)) == null) {
				
				curr.children.put(key.charAt(i), new MemEfficientTrie());
				
				//go to next node
				curr = curr.children.get(key.charAt(i));
				
			}
			
			curr.isLeaf = true;
		}
		
		
		}
		
		public boolean search(String key) {
			
			System.out.println("Searching: " +key);
			
			MemEfficientTrie curr = this;
			
			
			for(int i=0; i<key.length();i++) {
				
				if(curr!=null) {
					
					curr = curr.children.get(key.charAt(i));
				}else {
					return false;
				}
				
				
			}
			
		
		
		return curr.isLeaf;
		
	}
	
	public static void main(String[] args) {
		
		MemEfficientTrie head = new MemEfficientTrie();
		
		head.insert("Hello");
		head.insert("World");
		
		System.out.println(head.search("Hello"));
		System.out.println(head.search("World"));
		
		System.out.println(head.search("People"));
		
		head.insert("People");
		
		System.out.println(head.search("People"));
		
		
		
		
	}
	
	
	

}
