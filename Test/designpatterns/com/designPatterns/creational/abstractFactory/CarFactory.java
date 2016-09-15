package com.designPatterns.creational.abstractFactory;

public class CarFactory implements VehicleFactory{
	
	public Car getCar(String type){
		Car car=null;
		if(type!=null){
		switch(type.toUpperCase()){
		case "HB":
			car=new HatchBack();
		break;
		case "SEDAN":
		car=new Sedan();
		}
		
		}
		return car;
	}

	@Override
	public Bus getBus(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
