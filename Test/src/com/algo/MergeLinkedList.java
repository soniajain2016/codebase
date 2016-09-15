package com.algo;

public class MergeLinkedList {

	  /* static Node node1; 
	    static Node node2;*/
		public static void main(String a[]){
			Node node=new Node(7);
			 MergeLinkedList m=new MergeLinkedList();
			m.addElement(new Node(13), node);
			m.addElement(new Node(3), node);
				
			m.addElement(new Node(15), node);
			m.addElement(new Node(12), node);
			m.addElement(new Node(17), node);
			Node m1=m.mergeSortLL(node);
			while(m1!=null){
				System.out.println(m1.value);
				m1=m1.next;
			}
		}
		
		public Node mergeSortLL(Node head){

				if(head == null || head.next == null){

						return head;

					}

					Node slow = head;

					Node fast = head;

				  while (fast.next != null && fast.next.next != null){

				        fast = fast.next.next;

				        slow = slow.next;

				    }

					Node head2 = slow.next; 	  //Starting node of second half

					slow.next = null;			  //Make last node of first half point to null

					head = mergeSortLL(head);

					head2 = mergeSortLL(head2);

					return merge(head, head2);

				}

			//* --- Utility function for merging 2 sorted lists --- *	

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

	
		void addElement(Node n,Node node){
			Node temp=node;
			if(node==null)
				node=n;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=n;
		}
	/*	Node mergeNode;
		
		Node merge(Node node1,Node node2){
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
			 while(temp.next!=null){
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
			
		}*/
		
		static class Node{
			Node next;
			int value;
			Node(int value){
				this.value=value;
			}
		}
	}


