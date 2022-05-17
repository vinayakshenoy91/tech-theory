package Algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateInPrimeArray {

  public static void main(String[] args) {

    System.out.println(removeDuplicate(new int[]{2,2,3,3,7,5},6));

  }

  static ArrayList<Integer>  removeDuplicate(int[]arr,int n){

    Set<Integer> s = new LinkedHashSet<>();

    Arrays.stream(arr).forEach(i->s.add(i));

    ArrayList<Integer> list=new ArrayList<>();
    list.addAll(s);


    return list;

  }

}
