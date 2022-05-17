
//Reversal Algorithm is most preferred

package com.ds.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//O(n*d)
public class RotateAnArray {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5,6,7};
		
		int numPlaces = 2;
		
		for(int i=0;i<numPlaces;i++) {
			int temp = arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}	
			arr[arr.length-1]=temp;
		}
		
		List<Integer> l = Arrays.asList(arr);
		
		List<Integer> items = l.stream().map((item)->{
            return item;
		}).collect(Collectors.toList());
		
		
		System.out.println(items);
		
	}
}

/*
 * The Reversal Algorithm  - Most preferred
 * 
 * rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);

import java.io.*; 
  
class LeftRotate { 

    static void leftRotate(int arr[], int d) 
    { 
  
        if (d == 0) 
            return; 
        int n = arr.length; 
        rvereseArray(arr, 0, d - 1); 
        rvereseArray(arr, d, n - 1); 
        rvereseArray(arr, 0, n - 1); 
    } 
    
    
  
    //Function to reverse arr[] from index start to end
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        while (start < end) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 
  
    //UTILITY FUNCTIONS
    //function to print an array 
    static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    //Driver program to test above functions
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        int n = arr.length; 
        int d = 2; 
  
        // in case the rotating factor is 
        // greater than array length 
        d = d % n; 
        leftRotate(arr, d); // Rotate array by d 
        printArray(arr); 
    } 
} 

*/




/*
 
 Block swappign algo:
 
 Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them



//Recursive impl:
 * 
 * import java.util.*;

class GFG 
{
	// Wrapper over the recursive function leftRotateRec()
	// It left rotates arr[] by d.
	public static void leftRotate(int arr[], int d, 
												int n)
	{
		leftRotateRec(arr, 0, d, n);
	}

	public static void leftRotateRec(int arr[], int i, 
								int d, int n)
	{

		if(d == 0 || d == n) 
			return; 
		

		if(n - d == d) 
		{ 
			swap(arr, i, n - d + i, d); 
			return; 
		} 
		

		if(d < n - d) 
		{ 
			swap(arr, i, n - d + i, d); 
			leftRotateRec(arr, i, d, n - d);	 
		} 
		else 
		{ 
			swap(arr, i, d, n - d); 
			leftRotateRec(arr, n - d + i, 2 * d - n, d);
		} 
	}


public static void printArray(int arr[], int size) 
{ 
	int i; 
	for(i = 0; i < size; i++) 
		System.out.print(arr[i] + " "); 
	System.out.println(); 
} 

public static void swap(int arr[], int fi,
						int si, int d) 
{ 
	int i, temp; 
	for(i = 0; i < d; i++) 
	{ 
		temp = arr[fi + i]; 
		arr[fi + i] = arr[si + i]; 
		arr[si + i] = temp; 
	} 
} 

// Driver Code
public static void main (String[] args) 
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7}; 
	leftRotate(arr, 2, 7); 
	printArray(arr, 7);	 
}
}

// This code is contributed by codeseeker

*/


/*

Block swapping - iterative


//Java code for above implementation
static void leftRotate(int arr[], int d, int n) 
{ 
int i, j; 
if(d == 0 || d == n) 
    return; 
i = d; 
j = n - d; 
while (i != j) 
{ 
    if(i < j) 
    { 
    swap(arr, d-i, d+j-i, i); 
    j -= i; 
    } 
    else 
    { 
    swap(arr, d-i, d, j); 
    i -= j; 
    } 
    // printArray(arr, 7); 
} 
swap(arr, d-i, d, i); 
} 

 */

