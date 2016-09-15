package com.algo;


public class DoubleLinkedListInsertion {
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
	
	void insertAtHead(Node a){
		Node temp=head;
		temp.prev=a;
		a.next=head;
		head=a;
	}

	void insertAtEnd(Node a){
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = a;
		a.prev=temp;
	}

	void insertAfter(Node after,Node a){
		Node temp=head;
		while(temp!=after)
		temp=temp.next;
		Node t1=temp.next;
		temp.next=a;
		a.prev=temp;
		a.next=t1;
		t1.prev=a;
	}
	void insertBefore(Node before,Node a){
		Node temp=head;
		while(temp.next!=before)
		temp=temp.next;
		
		
		Node t1=temp.next;
		temp.next=a;
		a.prev=temp;
		a.next=t1;
		t1.prev=a;
	}
	
	
	void deleteHead(){
		Node temp=head;
		temp=temp.next;
		temp.prev=null;
		head=temp;
	}
	void deleteEnd(){
		Node temp=head;
		while(temp.next.next!=null){			
			temp=temp.next;
		}
		temp.next=null;		
	}
	
	void deleteAfter(Node after){
		Node temp=head;
		while(temp!=after){
			temp=temp.next;
		}		
		Node next=null;
		if(temp.next.next!=null)
		next=temp.next.next;
		temp.next=next;
	    next.prev=after;
		
		
	}
	
    void deleteBefore(Node before){
    	Node temp=head;
    	if(temp.next==before && temp==head){
    		head=temp.next;
    		head.prev=null;
    		return;
    	}
		while(temp.next!=before){
			temp=temp.next;
		}
		Node prev=temp.prev;		
		Node next=before;
		
		prev.next=next;
		next.prev=prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedListInsertion c = new DoubleLinkedListInsertion();
		c.addElement(c.new Node(2));
		
		Node n1 = c.new Node(5);
		c.addElement(n1);
		c.addElement(c.new Node(15));
		
		Node n2=c.new Node(25);
		c.addElement(n2);
		c.addElement(c.new Node(35));
		//c.addElement(n1);
		c.insertAtHead(c.new Node(2));
		c.insertAtEnd(c.new Node(122));
		c.insertAfter(n1, c.new Node(10));
		c.insertBefore(n1, c.new Node(3));
		
		c.deleteHead();
		c.deleteEnd();
		c.deleteAfter(n1 );
		c.deleteBefore(n2);
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
