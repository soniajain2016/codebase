package com.algo;


public class SumOfLinkedList {

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
		SumOfLinkedList d=new SumOfLinkedList()
				;
		d.addElement(n);
		Node n1=new Node(4);
		d.addElement(n1);
		
		d.addElement(new Node(6));
		d.addElement(new Node(1));
		d.addElement(new Node(4));
		SumOfLinkedList d1=new SumOfLinkedList()
				;
		d1.addElement(new Node(3));
		d1.addElement(new Node(6));
		d1.addElement(new Node(6));
		d1.addElement(new Node(7));
		int k=d.findSum(d.head,d1.head);
		System.out.println(k);
	}
	
	int findSum(Node n1,Node n2){
		Node l1=n1;
		Node l2=n2;
		Node s1=n1;
		Node s2=n2;		
		int carry=0;
		int i=0;
		int j=0;
		String s="";
		while(l1!=null){
			l1=l1.next;
			i++;
		}
		while(l2!=null){
			l2=l2.next;
			j++;
		}
		while(s1!=null && s2!=null){
			carry=0;
			 if(i>j){
				while(i!=j){
				 int temp=s1.data;
				 s=s+temp;
				 s1=s1.next;
				 i--;
				}
				
			}else{
				while(i!=j){
					 int temp=s2.data;
					 s=s+temp;
					 s2=s2.next;
					 j--;
					}
					
			}
			 if(s1.next!=null && s2.next!=null){
					carry=(s1.next.data+s2.next.data)/10;
						   	 
				}int temp=(carry+s1.data+s2.data)%10;
				s=s+temp;
				s1=s1.next;
				s2=s2.next;
		}
		
		return Integer.parseInt(s);
	}

}
