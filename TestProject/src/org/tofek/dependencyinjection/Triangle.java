package org.tofek.dependencyinjection;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am in Triangle Class override the Shape interface");		
	}

}
