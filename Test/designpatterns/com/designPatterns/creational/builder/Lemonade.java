package com.designPatterns.creational.builder;

public class Lemonade extends Drinks {

	@Override
	public int price() {
		
		return 3;
	}

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
		return "soda, Lemon and sugar";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Lemonade";
	}

}
