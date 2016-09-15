package queue;

import java.util.LinkedList;
import java.util.List;

public class LLImplpPriorityQueue {
int rear;
int front;
	static class Node{
		Node next;
		int data;
		int priority;
		Node(int data,int priority){
			this.data=data;
			this.priority=priority;
		}
	}
	
	int rear(){
		return rear;
	}
	Node head;
	void enqueue(int val,int priority){
		Node newNode=new Node(val,priority);
		if(head==null){
			head=newNode;
		}else{
			Node temp=head;
			boolean isAdded=false;
			while(temp!=null){
			if( temp.next!=null&&priority>=temp.priority && priority<temp.next.priority ||(priority>=temp.priority&& temp.next==null)){
				newNode.next=temp;
				if(head==temp)
				head=newNode;
				else
					head.next=newNode;
				isAdded=true;
			}else if(head==temp && priority>temp.priority){				
				newNode.next=temp;
				head=newNode;
				isAdded=true;
			}
			temp=temp.next;	
			}if(!isAdded)
				temp.next=newNode;	
				
				
		}
		
		rear=newNode.data;
	}
	
	int dequeue ()throws Exception{
		if(head!=null){
		Node temp=head;
		head=temp.next;
		return temp.data;
		}else
		{
			throw new Exception();
		}
		//while(temp.nex)
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LLImplpPriorityQueue q = new LLImplpPriorityQueue();
			q.enqueue(10,1);
			q.enqueue(20,3);
			q.enqueue(30,2);
			q.enqueue(40,4);
			for(int i=0;i<4;i++){
				System.out.println(q.dequeue());
	
			}
						//System.out.println(q.front());
			//System.out.println(q.rear());
		} catch (Exception e) {

		}
	}
}
