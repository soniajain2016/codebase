package com.algo;

import com.algo.LinkedListInsertion.Node;

public class Test {

	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test l =new Test();
		Node n=new Node(2);
		l.addElement(n);
		l.addElement(new Node(5));
		l.addElement(new Node(15));
		l.addElement(new Node(25));
		l.addElement(new Node(35));
		l.addElement(new Node(45));
		l.addElement(new Node(55));
		l.addElement(new Node(65));
	
		;
		// l.print(l.reverse(l.head));
//		l.print(l.recursiveReverse(l.head));
		l.print(l.recu(l.head));


	}
	void addElement(Node n) {
		Node temp = head;
		if (head == null) {
			head = n;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	
	private void print(Node head) {
		Node k = head;
		while (k != null) {
			System.out.println(k.value);
			k = k.next;

		}
	}

	int i=0;
	Node recu(Node n){
		Node prev=null;;
		Node next=n.next;
		prev=n;
		if(next!=null)
		n.next=recu(next);
		
		return prev;
		
		
		
	}

}
