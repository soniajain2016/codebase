package com.algo;

import com.algo.SumOfLinkedList.Node;

public class RotateLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		
		Node(int a){
			this.data=a;
		}
	}
	
	
	void addElement(Node n){
		if(head==null){
			head=n;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=new Node(2);
		RotateLinkedList d=new RotateLinkedList();
				;
		d.addElement(n);
		
		d.addElement(new Node(6));
		d.addElement(new Node(1));
		d.addElement(new Node(4));
		d.addElement(new Node(10));
		d.addElement(new Node(20));
		d.addElement(new Node(40));
		d.rotateLinkedList(3);
		Node k=d.head;
	//	System.out.println(k);
		while(k!=null){
			System.out.println(k.data);
			k=k.next;
		}
	}
	

Node rotateLinkedList(int k){

	Node temp=head;
	//Node temp2=n;
	Node temp3=null;
	int i=0;
//	while(temp!=null){
	while(i<k-1){
		temp=temp.next;		
		i++;
	
	}//if(i==k)n.next=null;
	if(temp3==null)
		temp3=temp;
	//break;
	//}

	while(temp.next!=null){
		
		temp=temp.next;
	}
	temp.next=head;
	head=temp3.next;
	temp3.next=null;
	return temp3;

}


}
