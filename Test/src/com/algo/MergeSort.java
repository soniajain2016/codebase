package com.algo;

public class MergeSort {

	void merge(int a[], int l, int r) {
		int m;
		if (l < r) {
			m = (l + r) / 2;

			merge(a, l, m);
			
			merge(a, m + 1, r);
			 merge(a, l, m, r);

		}
		//return null;
	}

	int[] merge(int[] a, int l, int m, int r) {
		
		
		int lArrSize = m - l+1;
		int rArrSize = r - m ;
		int lArr[] = new int[lArrSize];
		int rArr[] = new int[rArrSize];
		for (int i = 0; i < lArrSize; ++i) {
              lArr[i]=a[l+i];
		}
		int k=m+1;
		for (int i = 0; i < rArrSize; ++i) {
               rArr[i]=a[k+i]  ;
		}
		int i=0;int j=0;int s=l;
        while(i<lArrSize&& j<rArrSize){
        	if(lArr[i]<=rArr[j]){
        		a[s]=lArr[i];
        		i++;
        		
        	}
        	else{
        		a[s]=rArr[j];
        		j++;
        		

        	}
        	s++;
                }
        	
        	while(i<lArrSize){
        		a[s++]=lArr[i++];
        		
        	}
        
        	while(j<rArrSize){
        		a[s]=rArr[j];
        		s++;
        		j++;
        	}
        
        
		return a;
	}

	public static void main(String a[]) {
		MergeSort ms = new MergeSort();
		int arr[] = new int[] { 1, 4, 6, 2, 8, 3 };
		ms.merge(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
