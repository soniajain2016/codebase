package com.designPatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> itemList=new ArrayList<>(); 
	
	
	
	void addItem(Item a){
		itemList.add(a);
	}
	
	int price(){
		int p=0;
		for(Item a:itemList){
			p=p+a.price();
		}
		return p;
	}
	
	void showItem(){
		for(Item a:itemList){
			
			System.out.print(a.name()+"  "+a.ingredients()+"  ");
			a.packing();
			System.out.println();
		}
	}
	

}
