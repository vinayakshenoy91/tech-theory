package DynamicProgramming;

import java.util.Arrays;

public class NumberFactor {

  public static void main(String[] args) {

    System.out.println(getWays(new int[]{1,3,4}, 5));

  }

  //Bottom up approach
  public static int getWays(int[] facts, int n) {

    // Write your code here.
    int[] nums = new int[n+1];
    nums[0]=1;

      for(int amount=1;amount<nums.length;amount++){
        for(int fact:facts){
          if(fact<=amount) {
            nums[amount] += nums[amount - fact];
          }
        }
      }


    return nums[n];
  };
}
