package com.algo;

public class LinkedListDeletion {
	int len;
	static class Node{
		Node next;
		int value;
		Node(int value){
			this.value=value;
			this.next=null;
		}
	}

	static Node head;
	
	void addElement(Node n){
		if(head==null){
			head=n;
		}else{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=n;
		}
	}
	
	
	Node deleteElement(int key){
		Node temp=head;
		Node prev=null;
		if(head.value==key){
			head=temp.next;
			return head;
		}
		else{
			while(temp!=null){
				if(temp.value!=key){
				     prev=temp;
					
				}
				else{
					prev.next=temp.next;
				}
				temp=temp.next;	
			}
		}
		return prev;
	}
	
	void deleteAtPosition(int pos){
		Node temp=head;
		Node prev=null;
		int i=0;
		if(pos==0){
			head=temp.next;
			//return head;
		}
		else{	
			
			while(temp!=null){				
				if(i!=pos){
				     prev=temp;
					
				}
				else{
					prev.next=temp.next;
				}
				i++;
				temp=temp.next;	
			}
		}
		//return temp;
	}
	public static void main(String ar[]){
		
		Node head1 =new Node(2);
		LinkedListDeletion l=new LinkedListDeletion();
		l.addElement(head1);
		l.addElement(new Node(3));
		l.addElement(new Node(13));
		l.addElement(new Node(23));
		l.addElement(new Node(30));
		int length=0;
		//l.deleteElement(2);
		l.deleteAtPosition(4);
		while(head!=null){
			System.out.println(head.value);
			head=head.next;
			length++;
		}
		System.out.println("length "+length);
		
		System.out.println("len "+l.count(head1));
		
	}
	
	public int count(Node node){
		return getLength(node);
	}
	public int getLength(Node node){
		if(node==null)
		return len;
		
		return	  1+getLength(node.next);
	
	}
	
	
}
