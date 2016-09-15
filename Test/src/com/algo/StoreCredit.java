package com.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StoreCredit {

	
	Set<String>  getProducts(Map<String,Integer> catalog, int storeCredit){
		Set<String> products=new HashSet<>();
		int maxNum=0;
		int nextVal;
		boolean isCreditUsed=false;
		Iterator<Entry<String,Integer>> it=catalog.entrySet().iterator();	
		while (it.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
					.next();
			if(maxNum<entry.getValue()){
			   maxNum=entry.getValue();
			}
			nextVal=storeCredit-entry.getValue();
			if(catalog.containsValue(nextVal)){
				isCreditUsed=true;
				System.out.println("Store credit can be fully used");
				break;
			}
		}
		if(!isCreditUsed){
			
		}
		return products;
	}
	
	
	public static void main(String args[]){
		
		Map<String, Integer> catalog=new HashMap<String, Integer>();
		catalog.put("ProductA",20);
		catalog.put("ProductB",10);
		catalog.put("ProductC",30);
		catalog.put("ProductD",40);
		catalog.put("ProductE",50);
		catalog.put("ProductF",60);
		catalog.put("ProductG",70);
		catalog.put("ProductH",80);
		catalog.put("ProductI",90);
		catalog.put("ProductJ",5);		
		StoreCredit storeCredit=new StoreCredit();
		Set<String> products=storeCredit.getProducts(catalog, 100);
		
	}
	
}
