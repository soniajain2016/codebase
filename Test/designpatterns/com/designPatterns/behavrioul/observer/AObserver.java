package com.designPatterns.behavrioul.observer;

public class AObserver extends Observer {
	
 public AObserver(Subject subject) {
     this.subject = subject;
     this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("A Observer");

	}

}
