package Sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {

    int[] arr = {5,4,9,3,7,2,6};

    System.out.println(Arrays.toString(bubbleSort(arr)));

  }

  public static int[] bubbleSort(int[] inputArr){

    for(int i=0;i<inputArr.length-1;i++){
      for(int j=0;j<inputArr.length-i-1;j++){
          if(inputArr[j]>inputArr[j+1]){
            int temp=inputArr[j+1];
            inputArr[j+1]=inputArr[j];
            inputArr[j]=temp;
          }
      }
    }

    return inputArr;

  }

}
