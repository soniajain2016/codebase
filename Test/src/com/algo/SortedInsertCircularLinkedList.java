package com.algo;

public class SortedInsertCircularLinkedList {
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

	void insert(Node newNode) {
		Node temp = head;
		boolean firstnode = true;
		int count = 0;
		if (temp == null)
			temp = newNode;
		else {
			while (temp != null) {
				if (firstnode && temp.value > newNode.value) {
					Node t1 = head;
					while (t1 != null) {
						if (t1.next == head) {
							t1.next = newNode;
						}
						t1 = t1.next;
					}
					newNode.next = head;
					head = newNode;
					firstnode = false;
					break;

				} else if (temp.next.value > newNode.value) {
					Node t1 = temp.next;
					temp.next = newNode;
					newNode.next = t1;
					break;
				} else {
					if (temp.next == head && count != 0) {
						temp.next = newNode;
						newNode.next = head;
						break;
					}
				}

				temp = temp.next;
				count++;

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedInsertCircularLinkedList c = new SortedInsertCircularLinkedList();
		Node n1 = c.new Node(5);
		c.addElement(n1);
		c.addElement(c.new Node(15));
		c.addElement(c.new Node(25));
		c.addElement(c.new Node(35));
		c.addElement(n1);
		c.insert(c.new Node(2));
		int count = 0;
		Node temp = c.head;
		while (c.head != null) {
			if (count != 0 && c.head == temp)
				break;
			System.out.println(c.head.value);
			c.head = c.head.next;
			count++;

		}

	}
}
