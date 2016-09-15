package com.algo;

import com.algo.LinkedListInsertion.Node;

public class LinkedListSWap {

	Node head;

	void addElement(Node node) {
		Node temp = head;
		if (head == null) {
			head = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSWap l = new LinkedListSWap();
		Node h = new Node(2);
		l.addElement(h);
		l.addElement(new Node(5));
		l.addElement(new Node(15));
		l.addElement(new Node(25));
		l.addElement(new Node(35));
		System.out.println(l.indexOf(35, h));
		
		/*Node k = l.swap(12, 35, h);
		while (k != null) {
			System.out.println(k.value);
			k = k.next;

		}*/
		System.out.println();
	}
	
	
	int indexOf(int val,Node node){
		int index=0;
		while(node!=null){
			if(node.value==val)
				return index;
			index++;
			node=node.next;
		}
		return -1;
	}

	public Node swap(int x, int y, Node actual) {
		int temp = -1;

		Node tempNode = null;
		boolean xPresent = false;
		boolean yPresent = false;
		LinkedListSWap s = new LinkedListSWap();
		
		while (actual != null) {			
			tempNode = new Node(actual.value);
			s.addElement(tempNode);
			if (actual.value == x) {
				if (temp != -1)
					actual.value = temp;
				else {
					temp = actual.value;
					actual.value = y;
				}
				xPresent = true;
			} else if (actual.value == y) {
				if (temp != -1)
					actual.value = temp;
				else {
					temp = actual.value;
					actual.value = x;
				}
				yPresent = true;
			}
			actual = actual.next;
		}

		if (!(xPresent && yPresent)) {
			actual = s.head;
			return actual;
		}
		return actual;
	}

}
