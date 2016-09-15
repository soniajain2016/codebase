package com.designPatterns.creational.abstractFactory;

public class VehicleFactoryProducer {
	
	public  VehicleFactory getFactory(String type){
		 VehicleFactory factory=null;
		if(type!=null){
			 
		switch (type.toUpperCase()){
		
		case "BUS":
			factory=new BusFactory();
			break;
		case "CAR":
		factory=new CarFactory();
		
		}
		}
		return factory;
	}

}
