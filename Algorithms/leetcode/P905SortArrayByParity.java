package Algos;

public class P905SortArrayByParity {

  public static void main(String[] args) {
    //[3,1,2,4]
  }

  public int[] sortArrayByParity(int[] nums) {

    int[] newArr = new int[nums.length];

    int lastIndex=nums.length-1;
    int firstIndex=0;

    for(int i=0;i<nums.length;i++){

      if(nums[i]%2==0){
        newArr[firstIndex]=nums[i];
        ++firstIndex;
      }else{
        newArr[lastIndex]=nums[i];
        --lastIndex;
      }
    }
    return newArr;
  }
}

/*
O(NlongN)
Space Complexity: O(N)O(N) for the sort
  class Solution {
    public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        //Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)

    }
        }




 */

/*

Complexity Analysis

Time Complexity: O(N)O(N), where NN is the length of A. Each step of the while loop makes j-i decrease by at least one. (Note that while quicksort is O(N \log N)O(NlogN) normally, this is O(N)O(N) because we only need one pass to sort the elements.)

Space Complexity: O(1)O(1) in additional space complexity.



Approach 3: In-Place
Intuition

If we want to do the sort in-place, we can use quicksort, a standard textbook algorithm.

Algorithm

We'll maintain two pointers i and j. The loop invariant is everything below i has parity 0 (ie. A[k] % 2 == 0 when k < i), and everything above j has parity 1.

Then, there are 4 cases for (A[i] % 2, A[j] % 2):

If it is (0, 1), then everything is correct: i++ and j--.

If it is (1, 0), we swap them so they are correct, then continue.

If it is (0, 0), only the i place is correct, so we i++ and continue.

If it is (1, 1), only the j place is correct, so we j-- and continue.

Throughout all 4 cases, the loop invariant is maintained, and j-i is getting smaller. So eventually we will be done with the array sorted as desired.

class Solution {
2
    public int[] sortArrayByParity(int[] A) {
3
        int i = 0, j = A.length - 1;
4
        while (i < j) {
5
            if (A[i] % 2 > A[j] % 2) {
6
                int tmp = A[i];
7
                A[i] = A[j];
8
                A[j] = tmp;
9
            }
10
​
11
            if (A[i] % 2 == 0) i++;
12
            if (A[j] % 2 == 1) j--;
13
        }
14
​
15
        return A;
16
    }
17
}

 */