class Solution {
    public boolean isPalindrome(String input) {
        
     int left=0;
     int right=input.length()-1;
     
     while(left<right){
         if(input.charAt(left)!=input.charAt(right)){
             return false;
         }
         
         ++left;
         --right;
     }
     return true;
    }
}
