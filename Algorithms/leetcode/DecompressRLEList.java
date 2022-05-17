package Algos;


/*
Time Complexity: O(M + N)
Auxiliary Space: O(M + N)
 */

import java.util.Arrays;

public class DecompressRLEList {

  public static void main(String[] args) {
    int[] num = {1, 2, 3, 4};
    System.out.println(Arrays.toString(decompressRLElist(num)));
  }

  public static int[] decompressRLElist(int[] nums) {

    int[] finalArray = {};

    for (int i = 0; i < nums.length; i += 2) {

      int freq = nums[i];
      int value = nums[i + 1];

      int[] tempArray = new int[freq];

      int falength = finalArray.length;

      int total = falength + freq;

      for (int j = 0; j < freq; j++) {

        tempArray[j] = value;
      }

      int[] c = new int[total];

      System.arraycopy(finalArray, 0, c, 0, falength);
      System.arraycopy(tempArray, 0, c, falength, freq);

      finalArray = c;
    }
    return finalArray;
  }

}

