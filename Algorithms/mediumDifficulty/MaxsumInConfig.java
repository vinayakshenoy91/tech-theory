package AlgoMedium;


import java.util.Arrays;

public class MaxsumInConfig {

  public static void main(String[] args) {
    System.out.println(max_sum(new int[]{8, 3, 1, 2}, 4));
  }

  static int max_sum(int A[], int n) {

    int finalSum=0;
    int[] rotatedArray=A;

    for(int i=0;i<n;i++){

      rotatedArray=rotateArr(rotatedArray,1,  n);



    }

    return finalSum;
  }


  static int[] rotateArr(int[] arr, int d, int n) {

    int[] tempArray = new int[n];


    for (int i = 0; i < n; i++) {

      if (i < d) {
        tempArray[n - d + i] = arr[i];

      } else {
        tempArray[i - d] = arr[i];
      }
    }

   return tempArray;
  }
}

/* Optimised code

// Java program to find maximum sum
// of all rotation of i*arr[i] using pivot.

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{

// function definition
static int maxSum(int arr[], int n)
{
    int sum = 0;
    int i;
    int pivot = findPivot(arr, n);

    // difference in pivot and index of
    // last element of array
    int diff = n - 1 - pivot;
    for(i = 0; i < n; i++)
    {
        sum= sum + ((i + diff) % n) * arr[i];
    }
    return sum;
}

// function to find pivot
static int findPivot(int arr[], int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        if(arr[i] > arr[(i + 1) % n])
            return i;
    }
    return 0;
}

// Driver code
public static void main(String args[])
{
    // rotated input array
    int arr[] = {8, 3, 1, 2};
    int n = arr.length;
    int max = maxSum(arr,n);
    System.out.println(max);

}
}




 */

/* Option 2

next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);



next_val = Value of ∑i*arr[i] after one rotation.

curr_val = Current value of ∑i*arr[i]

cum_sum = Sum of all array elements, i.e., ∑arr[i].



Lets take example {1, 2, 3}. Current value is 1*0+2*1+3*2

= 8. Shifting it by one will make it {2, 3, 1} and next value

will be 8 - (6 - 1) + 1*2 = 5 which is same as 2*0 + 3*1 + 1*2


---
import java.io.*;

class GFG {

    static int maxSum(int arr[], int n)
    {
        // Compute sum of all array elements
        int cum_sum = 0;
        for (int i = 0; i < n; i++)
            cum_sum += arr[i];

        // Compute sum of i*arr[i] for
        // initial configuration.
        int curr_val = 0;
        for (int i = 0; i < n; i++)
            curr_val += i * arr[i];

        // Initialize result
        int res = curr_val;

        // Compute values for other iterations
        for (int i = 1; i < n; i++)
        {
            // Compute next value using previous
            // value in O(1) time
            int next_val = curr_val - (cum_sum -
                          arr[i-1]) + arr[i-1] *
                          (n-1);

            // Update current value
            curr_val = next_val;

            // Update result if required
            res = Math.max(res, next_val);
        }

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {8, 3, 1, 2};
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}
// This code is contributed by Prerna Saini


 */