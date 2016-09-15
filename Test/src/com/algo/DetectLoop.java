package com.algo;

public class DetectLoop {

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
	
	Node findLood(Node n){
	Node loopNode=null;
		boolean isLoopDetected=false;	
		Node fastNode=n;
		Node slowNode=n;
		while(fastNode!=null&& fastNode.next!=null){
			slowNode=slowNode.next;		
			fastNode=fastNode.next.next;
			
			if(slowNode==fastNode){
			  removeLoop(fastNode,n);
				isLoopDetected=true;
				//fastNode=null;
			}
		}		
		return loopNode;
	}
	
	void removeLoop(Node loop,Node n){
		Node ptr1=n;
		Node ptr2=null;
		
		while(ptr1!=null){
			ptr2=loop;
			while(ptr2.next!=loop && ptr2.next!=ptr1){
				ptr2=ptr2.next;
			}
			if(ptr2.next==ptr1)
				break;
			ptr1=ptr1.next;
			
		}
		ptr2.next = null;
		//return null;
		
	}
	public static void main(String a[]){
		
		Node n=new Node(2);
		DetectLoop d=new DetectLoop()
				;
		d.addElement(n);
		Node n1=new Node(15);
		d.addElement(new Node(5));
		d.addElement(n1);
		d.addElement(new Node(25));
		d.addElement(new Node(35));
		d.addElement(n1);
		/*d.addElement(new Node(45));
		d.addElement(new Node(55));*
		/
		 * 
		 */
		
		d.findLood(d.head);
		System.out.println();		
		while(d.head!=null){
			System.out.println(d.head.data);
			d.head=d.head.next;
			//length++;
		}

		
	}
}
