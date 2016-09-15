package queue;

public class Deque {
	void insertFront(Node a){
		if(head==null)
			head=a;
		else 
			a.next=head;
		head.prev=a;
		   head=a;
	}
	
	void insertLast(Node a){
		
	}
	
	static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			this.data=data;
		}
	}
	
 Node head;
 void addElement(Node node){
	 if(head==null){
		 head=node;
	 }else{
		 Node temp=head;
		 while(temp.next!=null)
			 temp=temp.next;
		 temp.next=node;
		 node.prev=temp;
	 }
 }
	public static void main(String[] args) {
	try {
		Deque q = new Deque();
		q.addElement(new Node(2));
		q.addElement(new Node(10));
		q.addElement(new Node(20));
		q.insertFront(new Node(1));
	/*	q.enqueue(30,2);
		q.enqueue(40,4);
*/		/*for(int i=0;i<4;i++){
			System.out.println(q.dequeue());

		}
*/
		Node temp=q.head;
		while(temp!=null){
			if(temp.prev!=null)
			System.out.println("Prev "+temp.prev.data);
			System.out.println(temp.data);
			if(temp.next!=null)
			System.out.println("Next "+temp.next.data);
			temp=temp.next;
		}
		//System.out.println(q.front());
		//System.out.println(q.rear());
	} catch (Exception e) {

	}
	}
}
