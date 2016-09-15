package com.designPatterns.behavrioul.strategy;

public class DebitCard implements Payment {

	@Override
	public void pay() {
		System.out.println("Debit Card");
	}

}
