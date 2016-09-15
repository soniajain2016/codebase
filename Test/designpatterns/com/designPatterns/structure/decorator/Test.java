package com.designPatterns.structure.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeDecorator sd=new RedShapeDecorator(new Circle());
		sd.draw();

	}

}
