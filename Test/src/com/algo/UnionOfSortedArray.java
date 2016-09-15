package com.algo;

public class UnionOfSortedArray {
	int[] getUnion(int arr1[], int arr2[]) {
		int unionArr[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				unionArr[k] = arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				unionArr[k] = arr2[j];
				j++;
			} else {
				unionArr[k] = arr2[j];
				i++;
				j++;
			}

			k++;

		}

		if (i < arr1.length ) {

			while (i < arr1.length) {
				unionArr[k] = arr1[i];
				i++;
				k++;
			}
		} else if (j < arr2.length ) {

			while (j < arr2.length) {
				unionArr[k] = arr2[j];
				j++;
				k++;
			}
		}

		return unionArr;
	}

	int[] getIntersection(int[]arr1, int[] arr2){
		int[] intersection=new int[arr1.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j< arr2.length){
			if(arr1[i]<arr2[j]){
				i++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}else{
				intersection[k++]=arr1[i++];
				j++;
			}
			
		}
		return intersection;
		
	}
	
	public static void main(String args[]) {
		int arr1[] = new int[] { 1, 3, 5,6 };
		int arr2[] = new int[] {1, 2, 3,4, 5, 6,8,9 };
int union[]=new UnionOfSortedArray().getUnion(arr1, arr2);
int intersection[]=new UnionOfSortedArray().getIntersection(arr1, arr2);
for(int i=0;i<intersection.length;i++)
		System.out.print(intersection[i]);
		
	}

}
