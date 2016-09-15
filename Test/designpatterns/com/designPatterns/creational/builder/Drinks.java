package com.designPatterns.creational.builder;

public abstract class Drinks implements Item {

	public void packing(){
		Packing p=new Bottle();
		p.pack();
	}
	
}
