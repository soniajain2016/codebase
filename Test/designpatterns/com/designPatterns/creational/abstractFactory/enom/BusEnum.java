package com.designPatterns.creational.abstractFactory.enom;

import com.designPatterns.creational.abstractFactory.Bus;


public enum BusEnum {

     SemiSleeper("SS"){
    	@Override
    	public Bus getBus(){
    		return new com.designPatterns.creational.abstractFactory.SemiSleeper();
    	}
    },

    Sleeper("S"){
    	@Override
    	public Bus getBus(){
    		return new com.designPatterns.creational.abstractFactory.Sleeper();
    	}
    };
    
    private BusEnum(String type){
    	this.type=type;
    };
	
    public String getType(){
		return this.type;
	}
	 private String type;
	
	public abstract Bus getBus();
	
}
