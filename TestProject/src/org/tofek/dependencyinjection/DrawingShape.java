package org.tofek.dependencyinjection;

public class DrawingShape {
	// I am not instantiating any object, only declaring shape object.
	private Shape shape;
    // setter method is used to accept the object which would come from other class.
	public void setShape(Shape shape){
		this.shape = shape;
	}

	public void drawShape(){
		this.shape.draw();
	}
}
