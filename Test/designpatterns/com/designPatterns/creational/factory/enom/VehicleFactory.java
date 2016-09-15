package com.designPatterns.creational.factory.enom;

import com.designPatterns.creational.factory.Bus;
import com.designPatterns.creational.factory.Car;
import com.designPatterns.creational.factory.Vehicle;
import com.designPatterns.creational.factory.WaterTruck;

public enum VehicleFactory {
	
	CAR("car"){
		@Override
		public	Vehicle getVehicle(){
			return new Car();
		}
			
		},
	
	BUS("bus"){
			@Override
			public	Vehicle getVehicle(){
				return new Bus();
			}
				
			},
	WT("water truck"){
				@Override
				public	Vehicle getVehicle(){
					return new WaterTruck();
				}
					
				};
		
	
	private VehicleFactory(String type){
		this.type=type;
	};
	
	public String getType(){
		return this.type;
	}
	 private String type;
		public abstract Vehicle getVehicle();
	
		//we can use abstract method as well.
		/*public  Vehicle getVehicle(){
			return null;
		}*/


}
