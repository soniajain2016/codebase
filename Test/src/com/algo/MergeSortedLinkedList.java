package com.algo;

import com.algo.MergeLinkedList.Node;

public class MergeSortedLinkedList {

   static Node node1; 
    static Node node2;
	public static void main(String a[]){
		 node1=new Node(7);
		MergeSortedLinkedList m=new MergeSortedLinkedList();
		m.addElement(new Node(9), node1);
		m.addElement(new Node(13), node1);
		m.addElement(new Node(18), node1);
		m.addElement(new Node(20), node1);
		node2=new Node(2);		
		m.addElement(new Node(15), node2);
		m.addElement(new Node(17), node2);
		MergeLinkedList m3=new MergeLinkedList();
		
		Node m1=m3.merge(node1,node2);
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
	}
	Node mergeNode;
	
	Node merge(){
		int i=0;
	
		while(node1!=null && node2!=null){			
			int lValue=node1.value;
			int rValue=node2.value;
			if(lValue<rValue){
				merge(i,node1);	
				node1=node1.next;
				
			}else{
				merge(i,node2);		
				node2=node2.next;
			}
			
			i++;			
		}
		
		while(node1!=null){
			mergeNodes(i,node1);
			node1=node1.next;
		}
		while(node2!=null){
			mergeNodes(i,node2);
			node2=node2.next;
		}
		return mergeNode;
	}

	private void mergeNodes(int i,Node node) {
		int j;
		Node temp;
		temp=mergeNode;
		 j=i;
		 while(j!=1){
			 temp=temp.next;
			 j--;
		 }
		 temp.next=node;
	}

	private void merge(int i,Node node) {		
		if(mergeNode==null){
			mergeNode=node;			
		}
		else{
		mergeNodes(i, node);			
		}
		
	}
	
	
}
