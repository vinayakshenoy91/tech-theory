package Algos;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    rotateArr(new int[]{1, 2, 3, 4, 5}, 2, 5);
  }


  static void rotateArr(int[] arr, int d, int n) {

    int[] tempArray = new int[n];

    for (int i = 0; i < n; i++) {

      if (i < d) {
        tempArray[n - d + i] = arr[i];
      } else {
        tempArray[i - d] = arr[i];
      }
    }

    Arrays.stream(tempArray).forEach(System.out::print);
  }
}


// https://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/
// https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/

/*


    void leftRotate(int arr[], int d, int n)
    {
    d = d % n;
    int i, j, k, temp;
    int g_c_d = gcd(d, n);
    for (i = 0; i < g_c_d; i++) {
    temp = arr[i];
    j = i;
    while (true) {
    k = j + d;
    if (k >= n)
    k = k - n;
    if (k == i)
    break;
    arr[j] = arr[k];
    j = k;
    }
    arr[j] = temp;
    }
    }


    void printArray(int arr[], int size)
    {
    int i;
    for (i = 0; i < size; i++)
    System.out.print(arr[i] + " ");
    }

    int gcd(int a, int b)
    {
    if (b == 0)
    return a;
    else
    return gcd(b, a % b);
    }


public static void main(String[] args)
    {
    RotateArray rotate = new RotateArray();
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    rotate.leftRotate(arr, 2, 7);
    rotate.printArray(arr, 7);
    }
    }


 */