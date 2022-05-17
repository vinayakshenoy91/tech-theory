//Time Complexity #
//For a lookup array with m elements and a subset array with n elements, the time complexity is O(m+n).

package arraySubsetOfAnotherArray;

import java.util.HashSet;

public class ArraySubset {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = {3,4,5};
		
		System.out.println(isSubset(arr1,arr2));
	}
	
	
	
	public static boolean isSubset(int []arr1,int[]arr2) {
		
		
		HashSet<Integer> hset= new HashSet<>(); 
	    // hset stores all the values of arr1 
	    for(int i = 0; i < arr1.length; i++) { 
	      if(!hset.contains(arr1[i])) 
	        hset.add(arr1[i]); 
	    } 

	    // loop to check if all elements of arr2 also 
	    // lies in arr1 
	    for(int i = 0; i < arr2.length; i++) { 
	      if(!hset.contains(arr2[i])) 
	        return false; 
	    } 
	    return true; 
		
	}

}
