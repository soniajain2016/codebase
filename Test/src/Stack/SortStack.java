package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
//https://www.youtube.com/watch?v=Jhaf7G_sO3k
	Stack<Integer> sortedStack = new Stack<>();

	void sort(Stack<Integer> stack, int item) {

		if (sortedStack.isEmpty() || item >= sortedStack.peek()) {
			sortedStack.push(item);
			if (!stack.isEmpty())
				sort(stack, stack.pop());
			else
				return;
		} else if (!sortedStack.isEmpty()) {
			stack.push(sortedStack.pop());
			sort(stack, item);
		}

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-3);
		stack.push(14);
		stack.push(18);
		stack.push(-5);
		stack.push(30);
		SortStack st = new SortStack();
		System.out.println(Arrays.toString(stack.toArray()));
		st.sort(stack, stack.pop());
		System.out.println(Arrays.toString(st.sortedStack.toArray()));
	}
}
