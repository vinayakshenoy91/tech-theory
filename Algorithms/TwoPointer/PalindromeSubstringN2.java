class Solution {
    
    public int countPalindromesWithCenter(String input, int left, int right){
        int result=0;
        
         while (0 <= left && right < input.length() &&
                    input.charAt(left) == input.charAt(right)) {
            ++result;
            --left;
            ++right;
        }
        return result;
      
    }
    
    
    public int countPalindromes(String input) {
        int result=0;
        
        for(int i=0;i<input.length();i++){
            result +=countPalindromesWithCenter(input,i,i);
            result +=countPalindromesWithCenter(input,i,i+1);
        }
        
        return result;
    }
}
