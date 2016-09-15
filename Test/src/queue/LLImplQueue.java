package queue;

import java.util.LinkedList;
import java.util.List;

public class LLImplQueue {
int rear;
int front;
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
		}
	}
	
	int rear(){
		return rear;
	}
	Node head;
	void enqueue(int val){
		Node newNode=new Node(val);
		if(head==null){
			head=newNode;
		}else{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
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
			LLImplQueue q = new LLImplQueue();
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			for(int i=0;i<4;i++){
				System.out.println(q.dequeue());
	
			}
						//System.out.println(q.front());
			//System.out.println(q.rear());
		} catch (Exception e) {

		}
	}
}
