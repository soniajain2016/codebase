package com.algo;

/**
 * @author sonia This class is used to to do selection sort, first element will
 *         be compared in an array and the minimum value element will be placed
 *         front this is for ascending sorting. n2
 */
public class SelectionSort {

	int[] sort(int arr[]) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int minValueIndex = i;
			for (int j = i + 1; j < length; j++)
				if (arr[minValueIndex] > arr[j])
					minValueIndex = j;
			int temp = arr[minValueIndex];
			arr[minValueIndex] = arr[i];
			arr[i] = temp;

		}

		return arr;
	}

	public static void main(String[] args) {

		int sortedArray[] = new SelectionSort().sort(new int[] { 2, 5, 3, 1, 6, 2, 9 });
		for (int i : sortedArray)
			System.out.println(i);
	}

}
