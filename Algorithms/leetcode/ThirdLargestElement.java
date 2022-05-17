package Interview;

import java.util.Arrays;

public class ThirdLargestElement {

  public static void main(String[] args) {

    System.out.println(thirdLargest(new int[]{2,4,1,3,5},5));

  }


  public static int thirdLargest(int a[], int n){

    Arrays.sort(a);

    if(a.length-3<0){
      return -1;
    }

    return a[a.length-3];

  }



}

/*

{

    if (arr_size < 3)
    {
    printf(" Invalid Input ");
    return;
    }

    // Initialize first, second and third Largest element
    int first = arr[0], second = INT_MIN, third = INT_MIN;

    // Traverse array elements to find the third Largest
    for (int i = 1; i < arr_size ; i ++)
    {

    if (arr[i] > first)
    {
    third  = second;
    second = first;
    first  = arr[i];
    }


    else if (arr[i] > second)
    {
    third = second;
    second = arr[i];
    }

    else if (arr[i] > third)
    third = arr[i];
    }

    printf("The third Largest element is %d\n", third);
    }

 */