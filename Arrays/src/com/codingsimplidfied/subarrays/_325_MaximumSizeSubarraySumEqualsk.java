package com.codingsimplidfied.subarrays;

import java.util.*;

public class _325_MaximumSizeSubarraySumEqualsk {
    public int maxSubArrayLen(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(map.containsKey(sum - k)){
                System.out.println(i);
                max = Math.max(max, i - map.get(sum - k));
            }
            
            map.putIfAbsent(sum, i);
            System.out.println(map);
        }
        
        return max == Integer.MIN_VALUE ? 0 : max;
        
    }
}