package com.designPatterns.behavrioul.strategy;

public class Context {
	//its a strategy
	Payment payment;
	public Context(Payment payment){
		this.payment=payment;
	}
	
	public void executeStrategy(){
		payment.pay();
	}

}
