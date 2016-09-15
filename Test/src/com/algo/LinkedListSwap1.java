package com.algo;

import com.algo.LinkedListInsertion.Node;

public class LinkedListSwap1 {
Node head=null;

private  void print() {
	Node k=head;
	while (k != null) {
		System.out.println(k.value);
		k = k.next;

	}
}

void addElement(Node n){
	Node temp=head;
	if(head==null){
		head=n;
	}
	else{
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n;
	}
}


void swap(int x,int y){
	Node prevx=null,prevy=null,currx,curry,temp=null;
	currx=head;
	curry=head;
	while(currx!=null&& currx.value!=x){
		prevx=currx;
		currx=currx.next;
	}
	while(curry!=null&& curry.value!=y){
		prevy=curry;
		curry=curry.next;
	}
	if(currx==null||curry==null){
		return;
	}
	if(prevx==null){
		head=curry;
	}else
		prevx.next=curry;
	
	if(prevy==null){
		head=currx;
	}else
		prevy.next=currx;
	
	temp=currx.next;
	currx.next=curry.next;
	curry.next=temp;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedListSwap1 l = new LinkedListSwap1();
	Node h = new Node(2);
	l.addElement(h);
	l.addElement(new Node(5));
	l.addElement(new Node(15));
	l.addElement(new Node(25));
	l.addElement(new Node(35));
	l.swap(25, 35);
	l.print();
	System.out.println();
}



	
}
