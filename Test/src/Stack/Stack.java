package Stack;

public class Stack {
	
	int a[];
	
	int size;
	int minStack[];
	
	int capacity=10;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		a=new int[capacity];
		minStack=new int[capacity];
	}
	
	void ensureCapacity(){
	  if(size==capacity){		
		  int temp[]=a;
			a=new int[capacity];		
			int len=0;
			if(temp!=null)
			len=temp.length;
			for(int i=0;i<len;i++){
				a[i]=temp[i];			
			}
			
		  capacity=capacity+10;
	  }
	  
	}
	void push(int a1){
		//	ensureCapacity();		
			if(!isFull()){
			a[size]=a1;
			
			if(size==0){
				minStack[size]=a1;
			}else{
				int count=0;
				int temp[]=minStack.clone();
				for(int k=0;k<size;k++){
					if(a1>minStack[k])
					{	count=k;
						minStack[k]=a1;
						for(int z=count;z<size;z++){
							minStack[z+1]=temp[z];
						}
						break;
					}
					
					else{
						if(k==size-1)
						minStack[size]=a1;
						else continue;
					}
				}
				
			}
			size++;
			}
		}
	
	//get max
	void push1(int a1){
	//	ensureCapacity();		
		if(!isFull()){
		a[size]=a1;
		
		if(size==0){
			minStack[size]=a1;
		}else{
			int count=0;
			int temp[]=minStack.clone();
			for(int k=0;k<size;k++){
				if(a1<minStack[k])
				{	count=k;
					minStack[k]=a1;
					for(int z=count;z<size;z++){
						minStack[z+1]=temp[z];
					}
					break;
				}
				
				else{
					if(k==size-1)
					minStack[size]=a1;
					else continue;
				}
			}
			
		}
		size++;
		}
	}
	
	int pop(){
		if(size==0)
			return 0;
		int poped=a[--size];
		
		a[size]=0;
	return poped ;	
	}
	
	boolean isFull(){
		if(size==capacity)
			return true;
		return false;
					
	}
	
	boolean isEmpty(){
		if(size==0)
			return true;
		return false;
					
	}
	
	int getMin(){
		if(size==0)
			return 0;
		int poped=minStack[--size];
		
		minStack[size]=0;
	return poped ;	
	}
	static Stack st=new Stack();
	static Stack sortedSt=new Stack();
	public static void main(String a[]){
		
		st.push(4);
		st.push(1);
		st.push(2);
		System.out.println(st.size);
		int k=st.size;
		for(int i=0;i<k;i++)
		System.out.println(st.getMin());
	}

}
