package com.practice.polymorphismexample;

public class MethodOverloading {
	
	public static int average(int a, int b) {
		
		System.out.println("Executing first method: int");
		return (a+b)/2;
		
	}

	public static double average(double a, double b) {
		
		
		System.out.println("Executing second method: double");
		return (a+b)/2;
		
	}
	
	public static int average(int a, int b, int c) {
		
		System.out.println("Executing third method: int with 3 parameters");
		return (a+b+c)/3;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(average(2, 5));
		System.out.println(average(10.5, 15.5));
		System.out.println(average(14, 17, 16));
		System.out.println(average(10.5, 6));
		
		
		
		
		
	}
	
	
}
