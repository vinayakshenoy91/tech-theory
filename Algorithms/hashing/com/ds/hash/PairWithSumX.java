package com.ds.hash;

import java.util.LinkedHashMap;
import java.util.Map;

public class PairWithSumX {
	
	//Given an unsorted array and a number x, find if there is a pair with sum x
	
	//Soln: Insert item in hash table and before inserting if x-item is already in hash table -> if it is then return true
	
	
	public static void main(String[] args) {
		  Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(); 
		  
		  int [] arr= {1,2,3,4,6,5};
		    
	      for(int i=0;i<6;i++){
	         map.putIfAbsent(arr[i],0);
	         int x = map.get(arr[i]);
	         map.put(arr[i],x+1);
	      }
	  
	      System.out.println(map);
	     
	       for(int k: map.keySet()){
	           if(map.get(k)==1){
	        	   System.out.print(k+" ");
	           }
	       }      
		
	}
	
	

}
