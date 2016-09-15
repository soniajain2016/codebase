package com.designPatterns.creational.abstractFactory;

public class HatchBack implements Car{
	public void milleage(){
		System.out.println("30 miles per gallon");
	}
	public String type(){
		return "hatch back";
	}
	
	
}
