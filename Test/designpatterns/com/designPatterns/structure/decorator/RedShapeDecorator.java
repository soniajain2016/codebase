package com.designPatterns.structure.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
	    setRedBorder(shape);	
	}
	
	void setRedBorder(Shape shape){
		System.out.println("Red Border");
	}

}
