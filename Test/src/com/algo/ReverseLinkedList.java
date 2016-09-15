package com.algo;

import com.algo.LinkedListInsertion.Node;

public class ReverseLinkedList {

	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList l = new ReverseLinkedList();
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
		l.print(l.reverseEveryKNode1(n,3));

	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;

	}

	private void print(Node head) {
		Node k = head;
		while (k != null) {
			System.out.println(k.value);
			k = k.next;

		}
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

	Node rPrev = null;

	Node recursiveReverse(Node curr) {
		if (curr != null) {
			Node next = curr.next;
			curr.next = rPrev;
			rPrev = curr;
			recursiveReverse(next);
		}
		return rPrev;
	}
	
	
	Node reverseEveryKNode(Node node,int k){
		Node next=null;
		Node curr=node;
		Node prev=null;
		int i=0;
		Node x=null;
		while(i<k && curr!=null){
		 	 next=curr.next;
			curr.next=prev;
		 	prev=curr;
			curr=next;
			i++;
		}
		if(next!=null)
		node.next=reverseEveryKNode(next, k);
		return prev;		
		}
		
	
	Node reverseEveryKNode1(Node node,int k){
		Node next=null;
		Node curr=node;
		Node prev=null;
		/*while(curr!=null){
		Node x=curr;
		*/int i=0;
		
		while(i<k && curr!=null){
		 	 next=curr.next;
			curr.next=prev;
		 	prev=curr;
			curr=next;
			i++;
		}
		
		
		/*node=prev;
		node.next=&(x.next);
		}*/
		
		if(next!=null)
		node.next=reverseEveryKNode1(next, k);
		return prev;		
		}
	
	
/*	Node reverse(Node node,int k){
		Node curr=node;
		Node r=null;
		int i=0;
		while(curr!=null){
			while(i<k && curr!=null){
				Node r1=reverseEveryKNode1(node, k);
				if (r==null)
					r=r1;
				else
				{
		           			curr=curr.next;
		           			i++;
		           			if(i<k)continue;
				}
			}
		}
		return r;
	}*/
		
	

}
