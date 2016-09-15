package com.designPatterns.behavrioul.observer;

public class Client {

	
	public static void main(String ar[]){
		Subject subject=new Subject();
	
		new AObserver(subject);
		new BObserver(subject);
		subject.getState(3);
	}
}
