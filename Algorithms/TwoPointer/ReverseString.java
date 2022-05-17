class Solution {
    
    public void swap(char[]arr,int i,int j){
          char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    
    public String reverse(String input) {
        
        char[] charArray= input.toCharArray();
        
        int left=0;
        int right=input.length()-1;
        
        
        while(left<right){
            swap(charArray,left,right);
            ++left;
            --right;
        }
        
        return new String(charArray);
    }
}
