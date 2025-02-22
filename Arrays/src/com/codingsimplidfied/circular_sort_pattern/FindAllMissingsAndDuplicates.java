package com.codingsimplidfied.circular_sort_pattern;

import java.util.*;

public class FindAllMissingsAndDuplicates {

	
	public static void main(String[] args) {
		
		int[] arr = {2, 6, 4, 4, 4, 3, 2};
		
		
		System.out.println(solve(arr));
		
	}

	private static List<List<Integer>> solve(int[] arr) {
		 
		
		int i = 0, n = arr.length;
		while(i < n) {
			
			if(arr[i] != arr[arr[i] - 1]) {
				swap(arr, i, arr[i] - 1);
			}else {
				i++;
			}
			 
		}
		
//		System.out.println(Arrays.toString(arr));
//		[4, 2, 3, 4, 4, 6, 2]
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2= new ArrayList<>();
		
		for(i = 0; i < n; i++) {
			if(i + 1 != arr[i]) {
				l1.add(i + 1);
				l2.add(arr[i]);
			}
		}
		
		
		List<List<Integer>> result = new ArrayList<>();
		result.add(l1);
		result.add(l2);
		return result;
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}
	
}
