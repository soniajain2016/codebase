package com.designPatterns.creational.builder;

public class VegBurger extends Burger {

	@Override
	public int price() {
		
		return 4;
	}

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
		return "Potato, Bread, seasoning , cheese";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

}
