package com.codingsimplidfied;

public class CycleInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 1, 2};
		
		System.out.println(hasCycle(arr));
		
	}

	private static boolean hasCycle(int[] arr) {
		
		if(arr.length <= 1) {
			return false;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			int slow = i, fast = i;
			
			boolean isForward = arr[i] > 0;
			
			slow = getNext(arr, isForward, slow);
			
			if(slow == -1) {
				break;
			}
			
			fast = getNext(arr, isForward, fast);
			
			if(fast == -1) {
				break;
			}
			
			fast = getNext(arr, isForward, fast);
			
			if(fast == -1) {
				break;
			}
			
			if(slow == fast) {
				return true;
			}
			
			
		}
	
		return false;
	}

	private static int getNext(int[] arr, boolean isForward, int i) {
		
		boolean direction = arr[i] >= 0;
		
		if(isForward != direction) {
			return -1;
		}
		
		int nextIndex = (i + arr[i]) % arr.length;
		
		if(nextIndex < 0) {
			nextIndex += arr.length;			
		}
		
		if(nextIndex == i) {
			return -1;
		}
		
		return nextIndex;
	}

}
