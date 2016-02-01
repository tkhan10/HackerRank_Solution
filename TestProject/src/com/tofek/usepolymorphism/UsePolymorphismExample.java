package com.tofek.usepolymorphism;

public class UsePolymorphismExample {

	public static void main(String[] args) {
	   // Scenario 2, use only interface 	
		/* This is under scenario 2
		Shape shape = new Triangle();
		shape.draw();
		
		Shape shape1 = new Circle();
		shape1.draw(); */
		
		Shape shape = new Triangle();
		myDrawShape(shape);
		
	}
	
	public static void myDrawShape(Shape shape){
		shape.draw();
	}

}
