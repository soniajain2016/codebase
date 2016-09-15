package com.designPatterns.creational.factory;

public class WaterTruck implements Vehicle {

	@Override
	public int speed() {
		
		return 40;
	}

	@Override
	public int load() {
		
		return 2000;
	}

	@Override
	public String vehicleType() {
		return "WATER Truck";
	}

}
