package com.poonia.problems;

public class BubulSort {

	public static void main(String[] args) {
		
		int arr1[] = { 0,5,1,9,50,40,30,3,6};
		int length = arr1.length;
		System.out.println("sorted array");
		BubulSort  bSort = new BubulSort();
		 bSort.bubleSort(arr1,length);
		for(int i=0;i<length;i++){
			System.out.println(arr1[i]);
		}

	}
	
    public int[] bubleSort(int arr[],int length){
    	
    	for(int i=0;i<length; i++){
    		for(int j=i;j<length;j++){
    			 
    			if(arr[i]>arr[j]){
    				int temp = arr[j];
    				arr[j] = arr[i];
    				arr[i]= temp;
    			}
    		}
    	}
    	
    	return arr;
      }

}
