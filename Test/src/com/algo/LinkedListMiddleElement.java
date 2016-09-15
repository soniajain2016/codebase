package com.algo;

/**
 * 
 * This class is used to find the middle element of a linked list in one pass.
 * @author sonia
 *
 */
public class LinkedListMiddleElement {
	static Node head;

	static class Node{
		Node next;
		int value;
		Node(int value){
			this.value=value;
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
	

	int findMiddleElement(Node node){
		Node firstPointer=node;
		Node secondPointer=node;
		
		while(secondPointer!=null && secondPointer.next!=null && firstPointer!=null){
			firstPointer=firstPointer.next;
			
			secondPointer=secondPointer.next.next;
		}
		
		return firstPointer.value;
	}
	
	public static void main(String[] args) {
		
		 Node h=new Node(2);
		 
		 LinkedListMiddleElement lm= new LinkedListMiddleElement();
		 lm.addElement(h);
		 lm.addElement(new Node(5));
		 lm.addElement(new Node(7));
		 lm.addElement(new Node(15));
		 lm.addElement(new Node(19));
		 lm.addElement(new Node(20));
		 lm.addElement(new Node(3));
		 lm.addElement(new Node(13));
		 System.out.println(new LinkedListMiddleElement().findMiddleElement(h));
	}



	
	
	
}
