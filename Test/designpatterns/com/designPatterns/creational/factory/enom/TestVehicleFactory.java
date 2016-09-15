package com.designPatterns.creational.factory.enom;

//pros -clean code no if and else or switch case.
//performance better take less time 
//enum can have only private constructor and can also have abstract method if the enum type has overriden it.
//enum cannot be inherited
public class TestVehicleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(VehicleFactory.CAR.getType());
System.out.println(VehicleFactory.CAR.getVehicle().load());
System.out.println(VehicleFactory.CAR.getVehicle().speed());
System.out.println(VehicleFactory.BUS.getType());
System.out.println(VehicleFactory.BUS.getVehicle().load());
System.out.println(VehicleFactory.BUS.getVehicle().speed());
System.out.println(VehicleFactory.WT.getType());
System.out.println(VehicleFactory.WT.getVehicle().load());
System.out.println(VehicleFactory.WT.getVehicle().speed());

	}

}
