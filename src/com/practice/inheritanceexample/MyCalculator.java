package com.practice.inheritanceexample;

public class MyCalculator extends Calculations{
	
	public void multiplication(int x, int y) {
		
		result = x * y;
		System.out.println("Product of x and y is: " +result);
		super.addition(x,y);
		
	}
	
	
	
	public static void main(String[] args) {
		
		int a=20, b=10;
		
		MyCalculator calc = new MyCalculator();
		
		//calc.addition(a, b);
		calc.subtraction(a, b);
		calc.multiplication(a, b);
		
		
		
	}
	
	
	
	

}
