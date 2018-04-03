package com.practice.datastruc;

class BSTNode{
	BSTNode left;
	BSTNode right;
	int data;
	
	BSTNode(int data){
		
		this.data = data;
		left = null;
		right = null;
		
	}
	
}

public class CheckIfBST {
	
	boolean checkBST(BSTNode root) {
		
		return checkBST(root, 0, 10000);	
		
	}
	
	boolean checkBST(BSTNode node, int min, int max) {
		
		if(node == null) {
			
			return true;
		}else if(node.data < min || node.data > max) {
			
			return false;
			
		}else {
			
			return checkBST(node.left, min, node.data - 1) && checkBST(node.right, node.data+1, max);
		}
		
	}

}
