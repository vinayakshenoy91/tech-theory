package com.ds.hash;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfAllElements {

	public static void main(String[] args) {

		// int[] arr = { 1, 2, 3, 3, 4 };
		Integer[] arr = { 1, 1, 1 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.putIfAbsent(arr[i], 0);
			int val = map.get(arr[i]);
			map.put(arr[i], val+1);
		}

		for (Integer key : map.keySet()) {
			System.out.println(MessageFormat.format("The number {0} has frequency {1}",key,map.get(key)));
		}

	}

}
