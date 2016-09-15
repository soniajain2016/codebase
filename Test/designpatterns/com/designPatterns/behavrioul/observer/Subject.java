package com.designPatterns.behavrioul.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	List<Observer> observers=new ArrayList<>();
	
	int state;
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	
	public void notifyObservers(){
		for(Observer o:observers){
			o.update();
		}
	}
	
	public void getState(int st){
		state=st;
		notifyObservers();
	}
	
	

}
