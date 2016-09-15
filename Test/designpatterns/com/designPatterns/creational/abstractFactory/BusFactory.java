package com.designPatterns.creational.abstractFactory;

public class BusFactory implements VehicleFactory {
	@Override
	public Bus getBus(String type){
		Bus bus=null;
		if(type!=null){
		switch(type.toUpperCase()){
		case "SS":
			bus=new SemiSleeper();
		break;
		case "S":
		bus=new Sleeper();
		}
		
		}
		return bus;
	}

	@Override
	public Car getCar(String type) {
		// TODO Auto-generated method stub
		return null;
	}



}
