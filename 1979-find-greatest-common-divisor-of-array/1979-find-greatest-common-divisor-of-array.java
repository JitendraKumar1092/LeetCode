class Solution {
    public int findGCD(int[] nums) {
        
        
        
        
        
         int small = nums[0];
        int big = nums[0] ;
        int gcd = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < small){
                small = nums[i];
            }
            else{
                if(nums[i]>big){
                    big=nums[i];
                }
            }
        }
        for(int i = 1 ; i <= small ; i ++){
            if(big % i == 0 && small % i == 0){
                gcd = i;
            }
        }
        return gcd;
     }
	 }