package com.designPatterns.creational.builder;

public class ChickenBurger extends Burger {

	@Override
	public int price() {
		
		return 5;
	}

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
		return "Chicken, Bread, seasoning , cheese";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

}
