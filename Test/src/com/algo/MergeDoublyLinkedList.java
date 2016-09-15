package com.algo;


public class MergeDoublyLinkedList {
	class Node {
		Node next;
		int value;
		Node prev;

		Node(int val) {
			this.value = val;
		}
	}

	Node head;

	void addElement(Node n) {
		if (head == null)
			head = n;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = n;
			n.prev = temp;
		}
	}

	  Node mergeSort(Node node) {
	        if (node == null || node.next == null) {
	            return node;
	        }
	        Node second = split(node);
	 
	        // Recur 
	        node = mergeSort(node);
	        second = mergeSort(second);
	 
	        // Merge the two 
	        return merge(node, second);
	    }


	Node merge(Node n1, Node n2) {
        Node mergedNod=null; 
        if(n1==null)
        	return n2;
        if(n2==null)
        	return n1;
		 if(n1.value<n2.value){
			 n1.next=merge(n1.next,n2);
			 n1.next.prev=n1;
			 n1.prev=null;
			 return n1;
		 }else{
			 n2.next=merge(n1,n2.next);
			 n2.next.prev=n2;
			 n2.prev=null;
			 return n2;
		 }
		//return mergedNod;
	}

	Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeDoublyLinkedList c = new MergeDoublyLinkedList();

		Node n1 = c.new Node(15);
		c.addElement(n1);
		c.addElement(c.new Node(45));

		Node n2 = c.new Node(25);
		c.addElement(n2);
		c.addElement(c.new Node(35));
		c.mergeSort(c.head);
		while (c.head != null) {
			if (c.head.prev != null)
				System.out.println("Previous   " + c.head.prev.value);
			System.out.println("Head   " + c.head.value);
			if (c.head.next != null)

				System.out.println("Next   " + c.head.next.value);

			c.head = c.head.next;

		}

	}
}
