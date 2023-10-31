class Solution {
     static void reverse(int[] arr , int start , int end){
         if ( start >= end) {
            
            return;
        }

        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
     } 
    public void rotate(int[] nums, int k) {
         k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
       
       reverse(nums ,0 , nums.length-k-1);
        reverse(nums ,nums.length-k , nums.length-1);
        reverse(nums , 0, nums.length-1);
        
        
    }
}