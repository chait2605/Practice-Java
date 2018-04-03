/**
 * 
 * Find the height of a binary tree
 * 
 * 
 * 
 */





package com.practice.datastruc;


import java.util.*;


class BNode{
	
	BNode left;
	BNode right;
	int data;
	
	BNode(int data){
		
		this.data = data;
		left = null;
		right = null;
		
	}

}




public class HeightOfABinaryTree {

	
	static int height(BNode root) {
		
		if(root == null) {
			
			return -1;
			
		}else {
			
			return 1+Math.max(height(root.left), height(root.right));	
		}
		
		
	}
	
	
	public static BNode insert(BNode root, int data) {
		
		
		if(root == null) {
			
			return new BNode(data);
		
			
		}else {
			
			
			BNode curr;
			if(data <= root.data) {
				
				curr = insert(root.left, data);
				root.left = curr;
				
				
			}else {
				
				
				curr = insert(root.right, data);
				root.right = curr;
			}
			
			return root;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		BNode root = null;
		while(t-- > 0) {
			
			int data = scan.nextInt();
			root = insert(root, data);
			System.out.println(root.data);
			
			
		}
		
		scan.close();
		int height = height(root);
		System.out.println(height);
	}
	
	
	

}
