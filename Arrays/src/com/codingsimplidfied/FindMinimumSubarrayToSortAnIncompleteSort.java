package com.codingsimplidfied;

public class FindMinimumSubarrayToSortAnIncompleteSort {
	
	public static void main(String[] args) {
		
		 int arr[] = { 1, 2, 5, 3, 0, 22, 13, 8, 15, 18 };
		 
		 System.out.println(solve(arr));
		
		
	}
	
	
	private static int solve(int[] arr) {
	
		if(arr.length == 0) {
			return 0;
		}
		
		
		int start = 0;
		
		while(start < arr.length - 1 && arr[start] < arr[start + 1]) {
			start++;
		}
		
		int end = arr.length - 1;
		
		while(end > 0 && arr[end] > arr[end - 1]) {
			end--;
		}
	 	
		//5, 3, 0, 22, 13, 8
		System.out.println(start+" "+end);
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = start + 1; i < end; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		while(start >= 0 && arr[start] > min) {
			start--;
		}
		
		while(end <= arr.length - 1 && arr[end] < max) {
			end++;
		}
		
		
		
		return end - start - 1;
	}

}
