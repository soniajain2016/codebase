package com.algo;

import com.algo.MergeLinkedList.Node;

public class MergeTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node(7);
		MergeTwoLinkedList m=new MergeTwoLinkedList();
		m.addElement(new Node(13), node);
		m.addElement(new Node(3), node);
		
		
		Node b=new Node(3);
		m.addElement(new Node(15), b);
		m.addElement(new Node(12), b);
		m.addElement(new Node(17), b);
		
		
		Node m1=m.merge(node,b);
		while(m1!=null){
			System.out.println(m1.value);
			m1=m1.next;
		}
	}
	void addElement(Node n,Node node){
		Node temp=node;
		if(node==null)
			node=n;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
	}static class Node{
		Node next;
		int value;
		Node(int value){
			this.value=value;
		}
	}
	
	public Node merge(Node head1, Node head2){

		if(head1 == null){ return head2; }

		if(head2 == null){ return head1; }

		if(head1.value <= head2.value){

			head1.next = merge(head1.next, head2);

			return head1;

		}else{

			head2.next = merge(head1, head2.next);

		return head2;

	}

}

}
