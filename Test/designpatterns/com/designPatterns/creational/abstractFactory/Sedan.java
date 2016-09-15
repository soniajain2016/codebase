package com.designPatterns.creational.abstractFactory;

public class Sedan  implements Car{
	public void milleage(){
		System.out.println("20 miles per gallon");
	}
	public String type(){
		return "sedan";
	}
}