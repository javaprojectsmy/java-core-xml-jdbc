package com.poonia.search;

public class BinarySearch {

	
	public static void main(String[] args){
		 int arr[] = {2, 3, 4, 10, 40};
		   int n = arr.length;
		   int x = 10;
		   int result = Search(arr, 0, n-1, x);
		   if (result == -1){
			   System.out.println("Element is not present in array");
		   }
		   else {
			   System.out.println("Element is present at index"+ result);
		   }
		  
		 
	}
	
	public static int Search(int arr[], int left, int right, int data){
		
	  if(right>1){
		  
		  int mid = left + (right-1)/2;
		  
		  if(arr[mid]==data){
			  return mid;
		  }
		  
		  if(arr[mid]>data){
			  return Search(arr, left, mid-1, data);
		  }
		  return Search(arr, mid+1, right, data);
	  }
	  return -1;
	}
}
