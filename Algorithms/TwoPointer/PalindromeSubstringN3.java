class Solution {
    
    private boolean isPalindrome(String input, int left, int right){
        
        while(left<right){
            
            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            ++left;
            --right;
            
        }
        return true;
    }
    
    
    
    public int countPalindromes(String input) {
        int result =0; 
        for(int i=0;i<input.length();i++){
            for(int j=i;j<input.length();j++){
             
             
             if(isPalindrome(input,i,j)){
                 ++result;
             }
            }
        }
        return result;
    }
}
