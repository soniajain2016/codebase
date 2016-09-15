package com.designPatterns.creational.factory;

public class Car implements Vehicle {

	@Override
	public int speed() {
		return 100;
	}

	@Override
	public int load() {
		return 500;
	}

	@Override
	public String vehicleType() {
		return "CAR";
	}

}
