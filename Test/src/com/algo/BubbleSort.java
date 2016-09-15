package com.algo;

/**
 * @author sonia compare one element with another for the whole loop
 *
 */
public class BubbleSort {

	public static void main(String as[]) {

		int sortedArray[] = new BubbleSort().sort(new int[] { 2, 5, 3, 1, 6, 2, 9 });
		for (int i : sortedArray)
			System.out.println(i);
	}

	int[] sort(int arr[]) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return arr;
	}
}
