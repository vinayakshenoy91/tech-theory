package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Complexity : O(n)
public class Fibonacci {

  public static void main(String[] args) {

    //System.out.println(fibMemo(6,new HashMap<>()));

    System.out.println(fibTab(6));

  }


  //Fib memoization

  public static int fibMemo(int n, Map<Integer,Integer> map){

     if(n==1){
       return 0;
     }

     if(n==2){
       return 1;
     }

     if(map.get(n)==null){
       map.put(n,fibMemo(n-1, map)+fibMemo(n-2, map));
     }

     return map.get(n);

  }

  //Fib tabulation
  public static int fibTab(int n){

    List<Integer> list = new ArrayList<>();


    if(n==1){
      return 0;
    }

    if(n==2){
      return 1;
    }

    list.add(0);
    list.add(1);

    for(int i=2;i<=n-1;i++){
      list.add(list.get(i-1)+list.get(i-2));
    }
    return list.get(n-1);
  }


}
