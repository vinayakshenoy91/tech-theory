//Anything which doesn't have element greater than itself in the right is called Leader

package com.ds.array;

public class LeadersInArray {
	public static void main(String[] args) {
		
		Integer [] arr = {5,3,20,15,8,3};

		int lastGreaterElement=arr[arr.length-1];
		
		for(int x=arr.length-1; x>=0;x--) {
			
			if(arr[x]>=lastGreaterElement ) {	
				System.out.println(arr[x]);
				lastGreaterElement =arr[x];
			}
			
		}
		
	}

}
