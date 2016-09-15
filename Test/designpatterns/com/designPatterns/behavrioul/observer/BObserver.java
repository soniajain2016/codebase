package com.designPatterns.behavrioul.observer;

public class BObserver extends Observer {

	BObserver(Subject subject){
		this.subject=subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("B Observer");

	}

}
