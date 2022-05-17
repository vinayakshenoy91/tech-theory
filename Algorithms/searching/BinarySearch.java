/*
 * Array needs to be sorted 
 * Time complexity-> O(logn)
 * 
 */



public class BinarySearch {

	
	public static void main(String[] args) {
		
		long a = System.nanoTime();
		
		
		int [] arr = {1,2,3,4,5};
		
		int itemToFind = 5;
		
		int midIndex = arr.length/2;
		
		int left =0;
		int right = arr.length-1;
		
		
		if(itemToFind ==arr[midIndex]) {
			System.out.println(midIndex);
		}
		
		if(itemToFind<arr[midIndex]) {
			right=midIndex-1;
			
		}
		
		if(itemToFind>arr[midIndex]) {
			left=midIndex+1;
		}
		
		boolean itemFound=false;
		for(int x = left;x<=right;x++) {
			if(arr[x]==itemToFind) {
				itemFound=true;
				System.out.println("Index of item is "+ x);
			}
		}
		
		if(!itemFound) {
			System.out.println("Index not found");
		}
		
		
		System.out.println("Time taken is =>"+(System.nanoTime()-a));
		
		
		
		
		
		
	}
}


/*Using recursion -> O(Logn) recursion call stack space.
int binarySearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 

        // If the element is present at the 
        // middle itself 
        if (arr[mid] == x) 
            return mid; 

        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 

        // Else the element can only be present 
        // in right subarray 
        return binarySearch(arr, mid + 1, r, x); 
    } 

    // We reach here when element is not present 
    // in array 
    return -1; 
} 
*/

/*Iterative impl -> O(1) time complexity*/
/*int binarySearch(int arr[], int x) 
{ 
    int l = 0, r = arr.length - 1; 
    while (l <= r) { 
        int m = l + (r - l) / 2; 

        // Check if x is present at mid 
        if (arr[m] == x) 
            return m; 

        // If x greater, ignore left half 
        if (arr[m] < x) 
            l = m + 1; 

        // If x is smaller, ignore right half 
        else
            r = m - 1; 
    } 

    // if we reach here, then element was 
    // not present 
    return -1; 
} */
