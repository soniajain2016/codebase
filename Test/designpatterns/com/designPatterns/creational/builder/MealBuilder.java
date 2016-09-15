package com.designPatterns.creational.builder;
/*
 * Used to build complex object
 * Sequence of steps to construct an object
-During creation.
-Elements are must.
-If its fails object incomplete.*/
public class MealBuilder {
	
	public static void main(String a[]){
		Meal m=new Meal();
		m.addItem(new ChickenBurger());
		m.addItem(new VegBurger());
		m.addItem(new Pepsi());
		m.addItem(new Lemonade());
		
		System.out.println(m.price());
		m.showItem();
	}

}
