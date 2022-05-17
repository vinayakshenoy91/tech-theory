package Algos;


import java.util.Arrays;

/*

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

 */

/*

  If O(1) memory, then use:

  nums[i]=n*[nums[nums[i]]%n]+nums[i];
  Finally divide the value by n, you will get quotient as the ans



 */

public class ZeroBasedPermutation {

  public static void main(String[] args) {

    int[] nums = {0,2,1,5,3,4};


    System.out.println("Final");
    System.out.println(Arrays.toString(buildArray(nums)));


  }


  public static int[] buildArray(int[] nums) {


    for(int i=0;i<nums.length;i++){

      System.out.println(Arrays.toString(nums));
      if(i!=nums[i]) {
        int temp = nums[i];
        nums[i] = nums[nums[i]];
        nums[nums[i]] = temp;
      }

    }

    return nums;


  }

}
