package com.algo;

public class LinkedListInsertion {

	Node head;
static class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}

void addElement(Node n){
	if(head==null)
		head=n;
	else{
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		LinkedListInsertion l=new LinkedListInsertion();
		Node head=new Node(2);		
		l.addElement(head);
		Node nodeAfter=new Node(25);
		l.addElement(new Node(5));
		l.addElement(new Node(15));
		l.addElement(nodeAfter);
		l.addElement(new Node(35));
		l.addElement(new Node(45));
		
		
		//adding node at the first
		Node newHead=new Node(1);
		newHead.next=head;
		while(newHead!=null){
			
			//System.out.println(newHead.value);
			newHead=newHead.next;
		}
		
		l.addNodeAfter(nodeAfter, 70);
		
		while(head!=null){
			System.out.println(head.value);
			head=head.next;
		}
		
	}
	
	
	private void addNodeAfter(Node previousNode,int value){
		
		Node newNode=new Node(value);
		newNode.next=previousNode.next;
		previousNode.next=newNode;
	}

}
