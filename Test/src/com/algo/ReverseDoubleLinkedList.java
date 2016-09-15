package com.algo;

import com.algo.DoubleLinkedListInsertion.Node;

public class ReverseDoubleLinkedList {
	class Node {
		Node next;
		int value;
        Node prev;
		Node(int val) {
			this.value = val;
		}
	}

	Node head;

	void addElement(Node n) {
		if (head == null)
			head = n;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = n;
			n.prev=temp;
		}
	}
	
	void reverse(Node node){
		Node current=head;
		Node newNode=null;
		Node prev=null,next=null;
		while(current!=null){
			prev=current.prev;
			next=current.next;
		//	Node x=current;
			//current=next;
			current.prev=next;
			current.next=prev;
			current=current.prev;
		}
		head=prev.prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDoubleLinkedList c = new ReverseDoubleLinkedList();
		
		Node n1 = c.new Node(5);
		c.addElement(n1);
		c.addElement(c.new Node(15));
		
		Node n2=c.new Node(25);
		c.addElement(n2);
		c.addElement(c.new Node(35));
		c.reverse(c.head);
		while (c.head != null) {
			if(c.head.prev!=null)
			System.out.println("Previous   "+ c.head.prev.value);
			System.out.println("Head   "+ c.head.value);
			if(c.head.next!=null)
				
			System.out.println("Next   "+ c.head.next.value);
			
			c.head = c.head.next;
		
		}

		
		
		
	}
}
