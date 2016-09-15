package com.designPatterns.structure.decorator;

public class ShapeDecorator {
	Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	public void draw(){
		shape.draw();
	}
	

}
