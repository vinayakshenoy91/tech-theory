class Solution {
    public int[] reorder(int[] nums) {
        
        int[] newArr = new int[nums.length];
        
        
        int left=0;
        int right = nums.length-1;
        
        int i=0;
        
        while(left<right){
            
            newArr[i]=nums[left];
            ++i;
   
             newArr[i]=nums[right];
             ++i;
          
            
            ++left;
            --right;
            
        }

        if(left==right){
            newArr[i]=nums[left];
        }
        
        return newArr;
        
    
    }
}
