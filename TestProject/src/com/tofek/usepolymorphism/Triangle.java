package com.tofek.usepolymorphism;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am in the Triangle Class override to Shape");	
	}

}
