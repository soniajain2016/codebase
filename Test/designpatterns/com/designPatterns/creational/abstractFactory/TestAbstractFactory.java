package com.designPatterns.creational.abstractFactory;

public class TestAbstractFactory {
	
	public static void main(String a[]){
		VehicleFactoryProducer vb=new VehicleFactoryProducer();
		VehicleFactory bus= vb.getFactory("bus");
		VehicleFactory car= vb.getFactory("car");
		Bus ss=bus.getBus("ss");
		Bus s=bus.getBus("s");
		Car hb=car.getCar("hb");
		Car sedan=car.getCar("sedan");
	sedan.milleage();
	hb.milleage();
	ss.getBusType();
	s.getBusType();
	}

}
