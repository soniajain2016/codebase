package com.designPatterns.creational.factory;

public class VehicleFactory {
	
	public Vehicle getVehicle(String s){
		Vehicle v=null;
		switch(s.toUpperCase()){
		case "CAR":
			v=new Car(); 
			break;
		case "BUS":
			v=new Bus();
			break;
		case "WATERTRUCK":
		v=new WaterTruck();
		break;
		}
		return v;
	}

}
