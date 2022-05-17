package com.ds.array;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		Integer [] arr = {1,2,3,4,5};
		
		int midpoint = (int) (arr.length%2==0? arr.length/2:Math.floor(arr.length/2));
		
		int finalIndex = arr.length-1;
		
		for(int i=0;i<midpoint;i++) {	
			int temp = arr[i];
			arr[i]= arr[finalIndex-i];
			arr[finalIndex-i]=temp;	
		}
		
		System.out.println(Arrays.asList(arr));
		
	}

}
