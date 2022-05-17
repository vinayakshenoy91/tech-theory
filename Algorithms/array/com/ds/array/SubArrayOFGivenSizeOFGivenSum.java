package com.ds.array;

//O(n)
public class SubArrayOFGivenSizeOFGivenSum {

	public static void main(String[] args) {

		int[] arr = { 1,4,20,3,10,5 };



		int givenSum = 33;


		int sum = 0;
		int k=3;
		for (int j = 0; j < k; j++) {
			sum += arr[j];
		}

		if(sum==givenSum) {
			for (int j = 0; j < k; j++) {
				System.out.println(arr[j]);
			}	
			return ;
		}
		
		
		for(int p=k;p<arr.length;p++) {
			sum=sum+arr[p]-arr[p-k];
			
			
			if(sum==givenSum) {
			  for(int j=p;j>p-k;j--) {
				  System.out.println(arr[j]);  
			  }
			  return;
			}
		}
		
		System.out.println("Not found");
		

	}

}
