package Stack;

import java.util.LinkedList;

public class StackUsingLL {
	
	static class Node{
		String data;
		Node next;
		public Node(String data) {
		this.data=data;
		}
		
	}
	LinkedList<String> a;
	int size;
	public StackUsingLL() {
		// TODO Auto-generated constructor stub
		a=new LinkedList<>();
	}
	//filo
	void push(Node newNode){
		if(head==null)
			head=newNode;
		else
		{      
			newNode.next=head;
			head=newNode;
		}
	}
	//lifo
	void push1(Node newNode){
		if(head==null)
			head=newNode;
		else
		{  
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newNode;
		}
	}
	
	Node head;
	void addElement(Node a){
		if(head==null)
			head=a;
		else{
			Node temp=head;
			while(temp.next==null)
				temp=temp.next;
			temp.next=a;
		}
	}
	
String pop2(){
		String s=null;
		if(head==null)return null;
		if(head.next==null){
			s=head.data;
			head=null;
		}			
		else{
			Node temp=head;
			//if(temp.next.next!=null){
			while(temp.next.next!=null){
				temp=temp.next;
			}
			s=temp.next.data;
	     	temp.next=null;
	
		}
		return s;
	}

	
	String pop(){
		String s=null;
		if(head==null)return null;
		if(head.next==null){
			s=head.data;
			head=null;
		}			
		else{
			Node temp=head;
			if(temp!=null){
			s=temp.data;
	     	head=temp.next;
			}
		}
		return s;
	}
	String pop1(){
		String s=null;
		if(head==null)return null;
		if(head.next==null){
			s=head.data;
			head=null;
		}			
		else{
			Node temp=head;
			if(temp!=null){
			s=temp.data;
	     	head=temp.next;
			}
		}
		return s;
	}
	
	public static void main(String[] args){
		StackUsingLL st=new StackUsingLL();
		st.push1(new Node("sonia"));
		st.push1(new Node("sonia1"));
		st.push1(new Node("sonia2"));
		st.push1(new Node("sonia3"));
		st.push1(new Node("sonia4"));
		for(int i=0;i<5;i++){
			System.out.println(st.pop2());
		}
	}
	
 
}
