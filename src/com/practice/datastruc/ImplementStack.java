package com.practice.datastruc;

public class ImplementStack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public ImplementStack(int s) {
		
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
		
	}
	
	public void push(long j) {
		
		stackArray[++top] = j;
		
	}
	
	public long pop() {
		
		return stackArray[top--];
	}
	

	public long peek() {
		
		return stackArray[top];
		
	}
	
	public boolean isEmpty() {
		
		return (top == -1);
		
	}
	
	
	public boolean isFull() {
		
		return (top == maxSize-1);
		
	}
	
	
	public static void main(String[] args) {
		
		ImplementStack newStack = new ImplementStack(10);
		newStack.push(10);
		newStack.push(20);
		newStack.push(30);
		newStack.push(40);
		newStack.push(50);
		
		while(!newStack.isEmpty()) {
			
			long value = newStack.pop();
			System.out.println(value);
			System.out.println(" ");
			
			
			
		}
		
		
		System.out.println(" ");
	}
	
	
}
