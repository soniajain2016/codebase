package com.designPatterns.behavrioul.strategy;

public class CreditCard implements Payment {

	@Override
	public void pay() {
		System.out.println("Credit Card");

	}

}
