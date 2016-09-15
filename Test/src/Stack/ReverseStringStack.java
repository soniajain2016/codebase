package Stack;

public class ReverseStringStack {

	static class Stack {
		char arr[] = new char[10];
		int size;

		void push(char a) {
			arr[size++] = a;
		}

		char pop() {
			if (size == 0)
				return ' ';
			return arr[--size];

		}

	}

	String reverse(String a) {

		Stack s = new Stack();
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			s.push(ch[i]);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			sb.append(s.pop());
		}
		return sb.toString();
	}

	public static void main(String ar[]) {
		ReverseStringStack st = new ReverseStringStack();
		System.out.println(st.reverse("sonia"));
	}

}
