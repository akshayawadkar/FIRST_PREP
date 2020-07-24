package com.codingsimplidfied.circular_sort_pattern;

public class First_Missing_Positive {
	
	 public static void main(String[] args) {
		
		 
		 int[] arr = {1, 2, 0};
		 
		 System.out.println(solve(arr));
		 
	}

	private static int solve(int[] arr) {
		
		
		int i = 0, n = arr.length;
		
		while(i < n) {
			
			if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
				swap(arr, i, arr[i] - 1);
			}else {
				i++;
			}
			
		}
		
		for(i = 0; i < n ; i++) {
			if(i + 1 != arr[i]) {
				return i + 1;
			}
		}
		
		
		return n + 1;
		
	}

	
	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
	
	
}
