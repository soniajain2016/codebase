package com.designPatterns.behavrioul.strategy;

public class Test {

	public static void main(String[] args) {
		Context ct=new Context(new CreditCard());
		Context ct1=new Context(new DebitCard());
		ct.executeStrategy();
		ct1.executeStrategy();
	}

}
