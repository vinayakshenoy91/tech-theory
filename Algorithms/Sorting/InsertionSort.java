package Sorting;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {

    int[] arr = {5,4,9,3,7,2,6};

    System.out.println(Arrays.toString(insertionSort(arr)));

  }

  public static int[] insertionSort(int[] inputArr){

    for(int i=1;i<inputArr.length;i++){
      int temp=inputArr[i],j=i;

      while(j>0 && inputArr[j-1]>temp){
        inputArr[j]=inputArr[j-1];
        j--;
      }

      inputArr[j]=temp;
    }
    return inputArr;
  }

}
