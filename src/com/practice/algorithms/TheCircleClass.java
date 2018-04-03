package com.practice.algorithms;

public class TheCircleClass {
	
	//create public constants using final keyword
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "red";
	
	//create private instance variables
	private double radius;
	private String color;
	
	//Overloaded constructors
	//Default constructor without parameters
	public TheCircleClass() {
		
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
		
	}
	
	//constructor with single parameter
	public TheCircleClass(double radius) {
		
		this.radius = radius;
		this.color = DEFAULT_COLOR;
		
	}
	
	//constructor with two parameters
	public TheCircleClass(double radius, String color) {
		
		this.radius = radius;
		this.color = color;
		
	}

	//define public getters and setters for the private variables
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String toString() {
		
		return "Circle[radius="+radius+", color = "+color+"]";
		
		
	}
	
	
	//return area of the circle
	public double getArea() {
		
		return radius*radius*Math.PI;
		
	}
	
	//return cicumference of the circle
	public double getCircumference() {
		
		return 2.0*Math.PI*radius;
	}
	
	public static void main(String[] args) {
		
		//test constructors and toString
		TheCircleClass c1 = new TheCircleClass();
		System.out.println(c1);
		TheCircleClass c2 = new TheCircleClass(2.0);
		System.out.println(c2);
		TheCircleClass c3 = new TheCircleClass(2.0, "green");
		System.out.println(c3);
		
		
		//test setters and getters
		c3.setRadius(4.0);
		c3.setColor("red");
		System.out.println(c3);
		System.out.println("The new radius is:" +c3.getRadius());
		System.out.println("The new color is:" +c3.getColor());

		//test getArea and getCircumference
		System.out.printf("The area is %.2f%n", c3.getArea());
		System.out.printf("The circumference is %.2f%n", c3.getCircumference());
		
	}
	
	
	
}
