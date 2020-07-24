package com.codingsimplidfied.circular_sort_pattern;

import java.util.Arrays;

public class CyclicSort {

	
	public static void main(String[] args) {
		
		int[] arr = {13, 14, 16, 12, 11, 15};
		System.out.println(Arrays.toString(arr));
		solve(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void solve(int[] arr) {
		 
		int i = 0, n = arr.length;
		
		int min = Integer.MAX_VALUE;
		for(int j : arr) {
			min = Math.min(min, j);
		}
		
		while(i < n) {
			if(arr[i] != arr[arr[i] - min]) {
				swap(arr, i, arr[i] - min);
			}else {
				i++;
			}
		}
		
		
	}

	private static void swap(int[] arr, int i, int j) {
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
