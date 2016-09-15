package com.designPatterns.creational.abstractFactory;
/*
the system needs to be independent from the way the products it works with are created.
the system is or should be configured to work with multiple families of products.
a family of products is designed to work only all together.
the creation of a library of products is needed, for which is relevant only the interface, not the implementation, too.*/
//in book it is a abstract class but I am using an interface
public interface VehicleFactory {

	
		 Car getCar(String type);
		 Bus getBus(String type);


}
