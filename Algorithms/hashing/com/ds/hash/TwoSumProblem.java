package com.ds.hash;

import java.util.HashMap;
import java.util.Map;

//Use dynamic programming
public class TwoSumProblem {
	public static void main(String[] args) {
		int[] nums = { 3, 5, 2, -4, 8, 11 };
		int s = 7;
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for (int i=0;i<nums.length;i++) {		
			int remainder= s - nums[i];
			if(hashMap.containsValue(remainder)) {
				System.out.println("The pair is "+ nums[i] +","+remainder);
			}
			hashMap.put(i, nums[i]);
		}
	}
}
