package com.algo;
import java.util.Scanner;
import java.util.Stack;

public class XMLValidation {

	/**
	 * This method validates if the xml tags are valid
	 * @param inputStr
	 * @return
	 */
	boolean isValidXML(String inputStr) {
		boolean isValid = false;
		if (inputStr.startsWith("<?xml")&& inputStr.indexOf("?>")!=-1) {
			inputStr = inputStr.substring(inputStr.indexOf("?>")+2, inputStr.length()).trim();
		}
		if(inputStr==null || inputStr.equals(""))
			return true;
		String elements[] = inputStr.split(" ");
		Stack<String> st = new Stack<>();
		int popC = 0;
		int pushC = 0;
		for (int i = 0; i < elements.length; i++) {
			String element = elements[i];

			if (element.startsWith("<") && !element.startsWith("</")) {
				pushC++;
				st.push(element);
			}
			StringBuilder endTag = new StringBuilder();
			if (!st.isEmpty()) {
				String startTag = st.peek();
				endTag.append("</").append(startTag.substring(1, startTag.length()));
				if(!startTag.endsWith(">"))
					endTag.append(">");
				if (element.endsWith("/>") || element.equals(endTag.toString())) {
					popC++;
					st.pop();
					isValid = true;

				}
			}
		}
		if (pushC != popC) {
			isValid = false;
		}
		return isValid;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (!scanner.hasNextInt()) {
			sb.append(" ").append(scanner.nextLine());

		}
		boolean isValidXML = new XMLValidation().isValidXML(sb.toString().trim());
		System.out.println(isValidXML);
		scanner.close();
	}

}
