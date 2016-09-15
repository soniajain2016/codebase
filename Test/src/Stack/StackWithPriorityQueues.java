package Stack;

import java.util.PriorityQueue;
import java.util.Queue;

public class StackWithPriorityQueues {
	Queue<Element> q1=new PriorityQueue<Element>();
	
	int priority;
	static class Element implements Comparable<Element>{
		int priority=0;
		int val=0;
		public Element(int prio,int val) {
			this.priority=prio;
			this.val=val;
		}
	

		@Override
		public int compareTo(Element o) {
			if(priority>=o.priority)
				return -1;
				else return 1;
		}
	}
	//static Stack sortedSt=new Stack();
	void push(int a){
		q1.add(new Element(priority++, a));
	}
	
	int pop(){
		return q1.poll().val;
	}
	
	public static void main(String a[]){
		StackWithPriorityQueues st=new StackWithPriorityQueues();
		st.push(4);
		st.push(1);
		st.push(2);
		for(int i=0;i<3;i++)
		System.out.println(st.pop());
	}

	
}
