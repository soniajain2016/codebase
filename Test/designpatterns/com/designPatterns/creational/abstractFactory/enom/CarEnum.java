package com.designPatterns.creational.abstractFactory.enom;

import com.designPatterns.creational.abstractFactory.Car;
import com.designPatterns.creational.abstractFactory.HatchBack;


public enum CarEnum {

     HeatchBack("HB"){
    	@Override
    	public Car getCar(){
    		return new HatchBack();
    	}
    },

    Sedan("Sedan"){
    	@Override
    	public Car getCar(){
    		return new HatchBack();
    	}
    };
    
    private CarEnum(String type){
    	this.type=type;
    };
	
    public String getType(){
		return this.type;
	}
	 private String type;
	
	public abstract Car getCar();
	
}
