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

public class StoreCredit1 {

	Set<String> getProducts(Map<String, Integer> catalog, int storeCredit) {
		Set<String> products = new HashSet<>();
		int maxCreditUsed = 0;		
		int sum=0;
		Map<String, Integer> catalogCopy = new HashMap<>(catalog);
		Iterator<Entry<String, Integer>> catalogCopyItr = catalogCopy.entrySet().iterator();
	 label:
		while (catalogCopyItr.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> firstEntry = (Map.Entry<java.lang.String, java.lang.Integer>) catalogCopyItr
					.next();
			Iterator<Entry<String, Integer>> it = catalog.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
						.next();
				
				sum=firstEntry.getValue()+entry.getValue();
				if(maxCreditUsed<sum && sum<=storeCredit){
					products.clear();
					products.add(firstEntry.getKey());
					products.add(entry.getKey());			
					maxCreditUsed=sum;
				}
				
				if(maxCreditUsed==storeCredit ){
					System.out.println("Store credit can be fully used");
					
					break label;
				}
				
				
			}
		}

		
		return products;
	}

	public static void main(String args[]) {

		Map<String, Integer> catalog = new HashMap<String, Integer>();
		catalog.put("ProductA", 20);
		catalog.put("ProductB", 7);
		catalog.put("ProductC", 60);
		catalog.put("ProductD", 38);
		catalog.put("ProductE", 22);
		catalog.put("ProductF", 23);
		catalog.put("ProductG", 24);
		catalog.put("ProductH", 9);
		catalog.put("ProductI", 90);
		catalog.put("ProductJ", 5);
		StoreCredit1 storeCredit = new StoreCredit1();
		Set<String> products = storeCredit.getProducts(catalog, 100);
		
		Iterator<String> it=products.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
			
		}

	}

}
