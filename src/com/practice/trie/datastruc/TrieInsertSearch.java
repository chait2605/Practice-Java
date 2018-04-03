package com.practice.trie.datastruc;

import java.util.ArrayList;
import java.util.List;

public class TrieInsertSearch {
	
	private static final int CHAR_SIZE = 26;
	
	boolean isLeaf;
	List<TrieInsertSearch> children = null;
	
	//Constructor
	TrieInsertSearch(){
		
		isLeaf = false;
		children = new ArrayList<>();
		
		for(int i=0; i<CHAR_SIZE; i++) {
			
			children.add(null);
			
		}
		
	
	}
	
	//Iterative function to insert a string in trie ds
	public void insert(String key) {
		
		System.out.println("Inserting" +key );
		
		//start from root node
		TrieInsertSearch curr = this;
		
		for(int i=0; i<key.length();i++) {
			
			
			//'a' - 'a' = 0
			//'b' - 'a' = 1
			//'c' - 'a' = 2
			if(curr.children.isEmpty()) {
				
				curr.children.set(key.charAt(i) - 'A', new TrieInsertSearch());
				
				//go to the next node
				curr = curr.children.get(key.charAt(i) - 'A');
				
			}
			
			curr.isLeaf = true;
		}
			
		}
	
	//iterative function to search a key in Trie
	//returns true if the key is found
	public boolean search(String key) {
		
		System.out.println("Searching " +key);

		TrieInsertSearch curr = this;
		
		for(int i=0; i<key.length();i++) {
			
			//got to next node
			if(curr!=null) {
			curr = curr.children.get(key.charAt(i) - 'A');
			
			}else {
			
			
				return false;
				
			}
			
			
		}
		
		
		return curr.isLeaf;
		
	}
	
	public static void main(String[] args) {
		
		//construct a new Trie node
		TrieInsertSearch head = new TrieInsertSearch();
		
		head.insert("Hello");
		head.insert("World");
		
		System.out.println(head.search("Hello"));
		System.out.println(head.search("World"));
		
		System.out.println("People");
		 
		
		head.insert("People");
		
		System.out.println(head.search("People"));
		
		
	}
	
	
	
	
	}
	

	
	
	


