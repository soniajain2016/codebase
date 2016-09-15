package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class FindMiddleElement {
	LinkedList<Integer> q1=new LinkedList<>();
    int mid=0;
	void push(int a){
		if(q1.isEmpty())
		q1.add(a);else{
			Queue<Integer> q2=new LinkedList<>();
			int size=q1.size();
			int midcount=q1.size()/2;
			if(size%2==0)midcount--;
			for(int i=0;i<size;i++){
				int k=q1.peek();
				q2.add(k);
				if(i==midcount)
					mid=k;
				q1.remove();
			}
			q1.add(a);
			size=q2.size();			
			
			for(int k=0;k<size;k++){
				q1.add(q2.remove());
			}
		}
		
	}
	
	int pop(){
		
		return q1.poll();
	}
	
	
	int findMiddleElement(){
		return mid;
	}
	public static void main(String a[]){
		/*FindMiddleElement st=new FindMiddleElement();
		st.push(4);
		st.push(1);
		st.push(6);
		st.push(8);
		st.push(7);
		st.push(5);
		st.push(3);
		st.push(2);
		for(int i=0;i<3;i++)
		System.out.println(st.findMiddleElement());
		
		
		*/
		
		
		StackMid st=new FindMiddleElement().new StackMid();
        System.out.println("pushing 1 , 2, 3, 4, 5, 6");
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("complete stack from top to bottom is");
        st.traverse();
        System.out.println("delelte middle");
        st.deleteMiddle();
        st.traverse();
        System.out.println("middle element:"+st.findMiddle());
        System.out.println("delelte middle");
        st.deleteMiddle();
        st.traverse();
        System.out.println("middle element:"+st.findMiddle());

        System.out.println("Pooping top Element");
        st.pop();
        System.out.println("After pop the stack is:");
        st.traverse();
        System.out.println("Middle element now "+st.findMiddle());
        System.out.println("Deleting middle");
        st.deleteMiddle();
        st.traverse();
        System.out.println("middle"+st.findMiddle());
		
		
		
		
	}class StackMid {

	    private DLListNode mid;
	    private DLListNode top;

	    int count;

	    public StackMid() {
	        this.count=0;
	    }

	    void push(int x)
	    {
	        DLListNode newNode=new DLListNode(x);
	        newNode.previous=null;
	        newNode.next=this.top;
	        this.count++;
	        if(count==1)
	        {
	            this.mid=newNode;
	        }
	        else
	        {
	            this.top.previous=newNode;
	            if(count%2==1) {
	                this.mid = this.mid.previous;
	            }
	        }
	        this.top=newNode;
	    }

	    int pop()
	    {
	        if(this.top==null)
	        {
	            System.out.println("underflow");
	            return -1;
	        }
	        int popped=this.top.data;

	        this.top=this.top.next;

	        if(this.top!=null) {
	            this.top.previous = null;
	        }

	        this.count--;

	        if(this.count%2==0)
	        {
	            this.mid=this.mid.next;
	        }


	        return popped;
	    }

	    int findMiddle()
	    {
	        if(this.top==null)
	        {
	            return -1;
	        }
	        return this.mid.data;
	    }

	    void deleteMiddle()
	    {
	        if(this.count==0)
	        {
	            System.out.println("already emoty");
	            return;
	        }

	        if(this.count==1)
	        {
	            this.top=null;
	        }

	        else {
	            if(this.mid.previous !=null)
	            {
	                this.mid.previous.next=this.mid.next;

	            }
	            if( this.mid.next!=null)
	            {
	                this.mid.next.previous=this.mid.previous;
	            }

	            if(this.count%2==1) {
	                this.mid = this.mid.next;
	            }
	            else {
	                this.mid=this.mid.previous;
	            }

	        }
	        this.count--;
	    }

	    void traverse()
	    {
	        DLListNode curr=top;
	        while (curr!=null)
	        {
	            System.out.println(curr.data);
	            curr=curr.next;
	        }
	    }

	}

	class DLListNode{

	    int data;
	    DLListNode previous;
	    DLListNode next;

	    public DLListNode(int data) {
	        this.data = data;
	    }
	}
	
	
}


