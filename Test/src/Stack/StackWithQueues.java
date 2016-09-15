package Stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackWithQueues {
	Queue<Integer> q1=new LinkedList<>();

	void push(int a){
		if(q1.isEmpty())
		q1.add(a);else{
			Queue<Integer> q2=new LinkedList<>();
			int size=q1.size();
			for(int i=0;i<size;i++){
				q2.add(q1.remove());
			}
			q1.add(a);
			size=q2.size();
			for(int k=0;k<size;k++){
				q1.add(q2.remove());
			}
		}
		
	}
	
	int pop(){
		
		return q1.poll();
	}
	
	public static void main(String a[]){
		StackWithQueues st=new StackWithQueues();
		st.push(4);
		st.push(1);
		st.push(2);
		for(int i=0;i<3;i++)
		System.out.println(st.pop());
	}

	
}
