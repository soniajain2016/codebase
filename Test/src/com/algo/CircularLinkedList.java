package com.algo;

public class CircularLinkedList {

  class Node {
	  Node next;
	  int value;
	  Node(int val){
		  this.value=val;
	  }
  }
  Node head;
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
  
  void print(Node h){
	  Node temp=h;
	  int count=0;
	  while(temp!=null){
		  if(temp==head && count!=0){
			  break;
		  }
		  System.out.println(temp.value);
		  temp=temp.next;
		  count++;
	  }
  }

  void printDoWhile(Node h){
	  Node temp=h;
	  do{		  
		  System.out.println(temp.value);
		  temp=temp.next;		  
	  }
	  while(temp!=head);
  }
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CircularLinkedList c=new CircularLinkedList();
      Node n1= c.new Node(5);
      c.addElement(n1);
      c.addElement(c.new Node(15));
      c.addElement(c.new Node(25));
      c.addElement(c.new Node(35));
      c.addElement(c.new Node(45));
      c.addElement(n1);
      c.printDoWhile(c.head);   
	}

}
