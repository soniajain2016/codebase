package com.designPatterns.creational.builder;

public abstract class Burger implements Item {

	public void packing(){
		Packing p=new Wrapper();
		p.pack();
	}
	
	
}
