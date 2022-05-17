package Interview;

import java.util.ArrayList;
import java.util.List;

public class MinDistBetweenTwoNos {


  public static void main(String[] args) {

    System.out.println(minDist(new int[]{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3},12,3,6));

  }



  public static int minDist(int a[], int n, int x, int y) {
    // code here


    List<Integer> firstNumberIndexes = new ArrayList<>();
    List<Integer> secondNumberIndexes = new ArrayList<>();


    for(int i=0;i<n;i++){

      if(x==a[i]){
        firstNumberIndexes.add(i);
      }else if(y==a[i]){
        secondNumberIndexes.add(i);
      }

    }

    int smallest=-1;
    for(int p : firstNumberIndexes){
      for(int q:secondNumberIndexes){
        if(smallest==-1){
          smallest=Math.abs(p-q);
        }

        if(Math.abs(p-q)<smallest){
          smallest=Math.abs(p-q);
        }

      }
    }

    return smallest;
  }



}
/*

{

    //previous index and min distance
    int i=0,p=-1, min_dist=Integer.MAX_VALUE;

    for(i=0 ; i<n ; i++)
    {
        if(arr[i] ==x || arr[i] == y)
        {
            //we will check if p is not equal to -1 and
            //If the element at current index matches with
            //the element at index p , If yes then update
            //the minimum distance if needed
            if(p != -1 && arr[i] != arr[p])
                min_dist = Math.min(min_dist,i-p);

            //update the previous index
            p=i;
        }
    }
    //If distance is equal to int max
    if(min_dist==Integer.MAX_VALUE)
       return -1;
    return min_dist;
}
 */