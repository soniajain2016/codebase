package com.algo;

/**
 * This class is used to binary search binary search is a search done on sorted
 * array and in that the middleindex is found and based on that the comparison
 * is done if the element to be searched is in the first array or second and
 * then the index can be returned accordingly.
 * 
 * 
 * @author sonia
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test I am here");

		int k[] = { 2, 5, 7, 9, 10, 17, 21 };
		System.out.println("element 17 index " + new BinarySearch().binarySearch(k, 17,0,k.length));
	}

	private int binarySearch(int[] arr, int element,int start,int end) {
		int middleElement = start+(end-start) / 2;
		int index = 0;
		if(arr[middleElement]==element)
			return middleElement;
		if (element > arr[middleElement]) {
			index = binarySearch(arr, element, middleElement+1, end);
		} else {
			index = binarySearch(arr, element, start, middleElement);

		}
		return index;
	}

	

}
