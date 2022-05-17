package Algos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetDuplicateValues {

  public static void main(String[] args) {
    System.out.println(duplicates(new int []{13 ,9, 25, 1, 1 ,0 ,22, 13, 22 ,20, 3, 8 ,11 ,25 ,10 ,3 ,15 ,11 ,19, 20, 2 ,4 ,25, 14, 23 ,14}, 26));
  }

  public static ArrayList<Integer> duplicates(int arr[], int n) {
    // code here

    ArrayList<Integer> a = new ArrayList<Integer>();

    Map<Integer,Integer> m = new LinkedHashMap<>();


    for(int i=0;i<n;i++){
      if(m.get(arr[i])==null){
        m.put(arr[i],1);
      }else{
        if(m.get(arr[i])==1){
          a.add(arr[i]);
          m.put(arr[i],2);
        }
      }
    }

    if(a.size()==0){
      a.add(-1);
    }

    a.sort(Integer::compareTo);

    return a;
  }

}
