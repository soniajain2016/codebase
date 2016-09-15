package com.algo;

public class SplitCircularlinkedList {
	class Node {
		Node next;
		int value;

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
		}
	}

	Node first;
	Node second;

	void split() {
		Node fastpoint = head;
		Node slowPoint = head;

		int count = 0;
		while (fastpoint != null) {
			if (count != 0 && (fastpoint == head || fastpoint.next == head || fastpoint.next.next == head)) {
				break;
			}
			slowPoint = slowPoint.next;
			fastpoint = fastpoint.next.next;
			count++;
		}

		second = slowPoint.next;
		first = head;
		slowPoint.next = null;
		if (fastpoint.next == head)
			fastpoint.next = null;
		else {
			fastpoint.next.next = null;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitCircularlinkedList c = new SplitCircularlinkedList();
		Node n1 = c.new Node(5);
		c.addElement(n1);
		c.addElement(c.new Node(15));
		c.addElement(c.new Node(25));
		c.addElement(c.new Node(35));
		// c.addElement(c.new Node(45));
		// c.addElement(c.new Node(55));
		c.addElement(n1);
		c.split();
		while (c.first != null) {

			System.out.println(c.first.value);
			c.first = c.first.next;

		}

		System.out.println("second");
		while (c.second != null) {

			System.out.println(c.second.value);
			c.second = c.second.next;

		}
	}
}
