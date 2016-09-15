package com.designPatterns.creational.factory;

public class Bus implements Vehicle {

	@Override
	public int speed() {
		
		return 150;
	}

	@Override
	public int load() {
	
		return 2000;
	}
	
	@Override
	public String vehicleType() {
		return "BUS";
	}


}
