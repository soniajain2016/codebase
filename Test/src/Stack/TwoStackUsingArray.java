package Stack;

public class TwoStackUsingArray {
	
	static class Stack {
		int capacity=20;
		char arr[] = new char[capacity];
		int size1;
		int size2;
		
		void ensureCapacity(){
			if((size1+size2)==capacity){
				capacity=capacity+20;
			char temp[]=new char[capacity];
			for(int i=0;i<size1;i++){
				temp[i]=arr[i];
			}
			int len=capacity-1;
			for(int  j=size2-1;j>=0;j--){
				temp[len--]=arr[j];
			}
			arr=new char[capacity];
			arr=temp;
			}
		}

		void push1(char a) {
			ensureCapacity();
			arr[size1++] = a;
		}
		void push2(char a) {
			ensureCapacity();
			int k=capacity-size2-1;
			arr[k] = a;
			size2++;
		}

		char pop1() {
			if (size1 == 0)
				return ' ';
			return arr[--size1];

		}

		char pop2() {
			char s;
			if (size2 == 0)
				return ' ';
			s=arr[capacity-size2];
			size2--;
			return s ;

		}

	}
	
	
	
	public static void main(String a[]){
		TwoStackUsingArray t=new TwoStackUsingArray();
		Stack st=new Stack();
		st.push1('a');
		st.push1('b');
		st.push1('c');
		st.push1('d');
		st.push1('e');
		st.push1('f');
		st.push2('u');
		st.push2('v');
		
		st.push2('w');
		st.push2('x');
		st.push2('y');
		st.push2('z');
		for(int i=0;i<6;i++){
			System.out.println(st.pop1()+" "+st.pop2());
			
		}
		
	}

}
