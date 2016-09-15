package com.algo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IPAddressPermutation {
	Set<String> allPossibleIPAdds = new HashSet<>();

	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();

		if (inputString != null && inputString.trim().length() > 3) {
			int inputStrLength = inputString.length();
			int length = inputStrLength + 3;
			char inputChar[] = new char[length];
			for (int i = 0; i < inputStrLength; i++) {
				char c = inputString.charAt(i);
				int ascii = c;
				if (ascii > 47 && ascii < 58) {
					inputChar[i] = c;
				} else {
					System.out.println("Not a valid IP address");
					s.close();
					return;
				}
			}
			for (int i = inputStrLength; i < length; i++) {
				inputChar[i] = '.';
			}
			IPAddressPermutation ipAddressPermutation=new IPAddressPermutation();
			ipAddressPermutation.permute(inputChar, 0, length - 1);
			System.out.println(ipAddressPermutation.allPossibleIPAdds.size());
			Iterator<String> it = ipAddressPermutation.allPossibleIPAdds.iterator();
			while (it.hasNext()) {				
				System.out.println( it.next());
			}

		} else {
			System.out.println("Not a valid IP address");
		}
		s.close();
	}


	void permute(char[] a, int startIndex, int endIndex) {
		CharSequence charS = "..";
		int i;
		if (startIndex == endIndex) {
			//it gives all possible permutation but we have to get only unique and valid ip address
			String ipAddressStr = new String(a);
			if (!ipAddressStr.contains(charS) && !ipAddressStr.startsWith(".") && !ipAddressStr.endsWith(".")) {
				allPossibleIPAdds.add(ipAddressStr);
				
			}
		} else {
			for (i = startIndex; i <= endIndex; i++) {
				swap(a, startIndex, i);
				permute(a, startIndex + 1, endIndex);
				swap(a, startIndex, i);
			}
		}

		}

	private void swap(char[] a, int l, int i) {
		char temp = a[l];
		a[l] = a[i];
		a[i] = temp;
	}

}
