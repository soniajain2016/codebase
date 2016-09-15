package com.designPatterns.creational.factory;

public class TestFactory {

	
	public static void main(String s[]){
		VehicleFactory vf=new VehicleFactory();
		Vehicle car=vf.getVehicle("CAR");
		System.out.println(car.vehicleType());
		Vehicle bus=vf.getVehicle("BUS");
		System.out.println(bus.vehicleType());
		Vehicle wt=vf.getVehicle("WATERTRUCK");
		System.out.println(wt.vehicleType());
	}
}
