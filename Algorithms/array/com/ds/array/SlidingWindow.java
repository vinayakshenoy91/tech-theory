package com.ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//O(n)
public class SlidingWindow {

	public static void main(String[] args) {

		int[] arr = { 1,4,20,3,10,5 };

		List<Integer> list = new ArrayList<>();

		int k = 3;

		int sum = 0;
		for (int j = 0; j < k; j++) {
			sum += arr[j];
		}

		list.add(sum);
		
		
		for(int p=k;p<arr.length;p++) {
			sum=sum+arr[p]-arr[p-k];
			list.add(sum);	
		}
		
		System.out.println(Collections.max(list));

	}

}
