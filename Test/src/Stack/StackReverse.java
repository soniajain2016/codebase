package Stack;
import java.util.Stack;
public class StackReverse {
	
	Stack<Integer> st=new Stack();
	Stack<Integer> reverse=new Stack();
	void reverse(){
		if(!st.isEmpty()){
			reverse.push(st.pop());
			reverse();
		}
	}
	void printReverse(){
		if(!reverse.isEmpty()){
			System.out.println(reverse.pop());
			printReverse();
		}
	}
	
	public static void main(String a[]){
		StackReverse str=new StackReverse();
		str.st.push(23);
		str.st.push(30);
		str.st.push(34);
		str.st.push(2);
		str.st.push(1);
		str.reverse();
		str.printReverse();
	}

}
