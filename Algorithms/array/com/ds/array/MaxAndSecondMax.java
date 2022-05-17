package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class MaxAndSecondMax {
	
	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {

		  Integer max=arr[0];
	         Integer max2=-1;
	    for(int i=1;i<sizeOfArray;i++){
	      if(arr[i]>max){
	         max2=max;
	         max= arr[i];
	      }else if(arr[i]>max2 && arr[i]!=max){
	          max2=arr[i];
	      }
	     }
	     
	     List<Integer> list= new ArrayList<Integer>();
	     list.add(max);
	     list.add(max2);
	     return (ArrayList<Integer>) list;
	}

}
