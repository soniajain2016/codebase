package linkedin.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TwoSum {

	Map<Integer,Integer> map=new HashMap<>();
	public void store(int a){
		map.put(a,a);
	}
	
	public void test(int a){
		int diff;
		Iterator<Integer> it=map.keySet().iterator();
		while (it.hasNext()) {
			Integer next = (Integer) it.next();
			
			diff=a-next;
			if(map.get(diff)!=null && diff!=next){
				System.out.println("It contains the sum of two integer");
				break;
			}
		}
		map.put(a,a);
	}

}
