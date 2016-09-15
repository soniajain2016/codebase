package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
	
	Stack<Integer> stackValues=new Stack<>();
	@SuppressWarnings("unchecked")
	public void stock(Stack<Integer> stack){
		int curr=stack.pop();
		Stack<Integer> copiedStack=new Stack<>();
		copiedStack=(Stack<Integer>) stack.clone();
		int val=1;
		while(!copiedStack.isEmpty()){
			int newVal=copiedStack.pop();
			if(newVal<=curr){
				val++;
			}else{
				break;
			}
		}
		stackValues.push(val);
		if(stack.isEmpty())return;
		stock(stack);
	
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(80);
		stack.push(60);
		stack.push(70);
		stack.push(60);
		stack.push(75);
		stack.push(85);
		
		StockSpan st = new StockSpan();
		System.out.println(Arrays.toString(stack.toArray()));
		st.stock(stack);
		while(!st.stackValues.isEmpty())
		System.out.print(st.stackValues.pop()+" ");
	}
}
