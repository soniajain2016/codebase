package com.designPatterns.creational.builder;

public class Pepsi extends Drinks {

	@Override
	public int price() {
		
		return 3;
	}

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
		return "soda, color and sugar";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

}
