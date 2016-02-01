package org.tofek.dependencyinjection;

public class DependencyInjectionExample {

	public static void main(String[] args) {
	    Shape shape = new Circle();
	    DrawingShape drawingShape = new DrawingShape();
	    drawingShape.setShape(shape);
	    drawingShape.drawShape();
	}

}
