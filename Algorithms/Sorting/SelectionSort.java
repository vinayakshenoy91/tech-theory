package Sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {

    int[] arr = {5,4,9,3,7,2,6};

    System.out.println(Arrays.toString(selectionSort(arr)));

  }

  public static int[] selectionSort(int[] inputArr){

    for(int i=0;i<inputArr.length;i++){
      int minIndex=i;
      for(int j=i+1;j<inputArr.length;j++){
        if(inputArr[j]<inputArr[minIndex]){
          minIndex=j;
        }
      }
      if(minIndex!=i) {
        int temp = inputArr[i];
        inputArr[i] = inputArr[minIndex];
        inputArr[minIndex] = temp;
      }
    }
    return inputArr;
  }

}
