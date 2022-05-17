package com.ds.hash;

import java.util.HashMap;
import java.util.Map;


//Try this with hash set
public class CountDistinctElements {

	public static void main(String[] args) {

		//int[] arr = { 1, 2, 3, 3, 4 };
		int[] arr = { 1, 1,1 };


		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.putIfAbsent(arr[i], 0);
		}
		
		for(Integer key:map.keySet()) {
			System.out.println(key);
		}

	}

}
