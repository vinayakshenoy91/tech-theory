package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class ReverseInGroups {

	// Function to reverse array in group of k 
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        // add your code here
        
        List<Integer> list = new ArrayList<Integer>();
    
        int remainingItems = n%k;
        
        int numberOfBatches =(int)Math.floor(n/k);
        
        for(int i=1;i<=numberOfBatches;i++){
            
            for(int j=i*k-1;j>=(i-1)*k;j--){
                list.add(mv.get(j));
            }
            
        }
        
        for(int p=0;p< remainingItems;p++){
            list.add(mv.get(n-1-p));
        }
    
        
       return (ArrayList<Integer>) list;
        
        
    }
}
