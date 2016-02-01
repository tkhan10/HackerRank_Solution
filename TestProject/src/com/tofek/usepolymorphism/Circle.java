package com.tofek.usepolymorphism;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am in the Circle Class override to Shape");	
	}
  
}
