package queue;

public class Queue {
	/*Operations on Queue:
		 Mainly the following four basic operations are performed on queue:

		Enqueue: Adds an item to the queue. If the queue is full, then it is said to be an Overflow condition.
		Dequeue: Removes an item from the queue. The items are popped in the same order in which they are pushed. If the queue is empty, then it is said to be an Underflow condition.
		Front: Get the front item from queue.
		Rear: Get the last item from queue.
		10 enqueued to queue
20 enqueued to queue
30 enqueued to queue
40 enqueued to queue
10 dequeued from queue
Front item is 20
Rear item is 40
		*
		*/
	int arr[];
	int capacity=10;
	
	int size=0;
	
	public Queue() {
		// TODO Auto-generated constructor stub
		arr=new int[capacity];
	}
	int rear;
	int front;
void enqueue(int a) throws Exception{
	if(size==capacity){
	System.out.println("Queue Overflow exception");
		throw new Exception();
	}rear=a;
	arr[size++]=a;
	if(size-1==0){
		front=arr[size-1];
	}

}

int front(){
	return front;
}

int rear(){
	return rear;
}

int dequeue() throws Exception{
	int deque;
	if(size==0){
		System.out.println("Queue Underflow exception");
	throw new Exception();
	}
	deque=arr[0];
	adjust();
	front=arr[0];
	if(size!=0)
	rear=arr[size-1];
	else rear=0;
	return deque;
}

void adjust(){
	for(int i=0;i<size-1;i++){
		arr[i]=arr[i+1];
	}
	size--;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Queue q=new Queue();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
System.out.println(q.dequeue());
System.out.println(q.front());
System.out.println(q.rear());
		}catch(Exception e){
			
		}
	}

}

