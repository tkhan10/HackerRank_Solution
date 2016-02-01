package com.tofek.tightcoupling;

public class TightCouplingExample {
	public static void main(String[] args) {
		/* Here we are creating a class object for using the method of the class. it is called a tight coupling. 
		 * 
		 * */		
		
		Circle circle = new Circle();
		circle.draw();
		
		Triangle triangle = new Triangle();
		triangle.draw();
	}

}
