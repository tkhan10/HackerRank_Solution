package org.tofek.dependencyinjection;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("I am in Circle Class override the Shape interface");
	}

}
