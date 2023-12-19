class Solution {
    public int findMin(int[] nums) {
        int n = nums.length ,ns=nums[0];
        if(n==1) return nums[0];
        for (int i=1 ;i<n;i++){
           
            if(nums[i]<nums[i-1]){
                
                ns=nums[i];
                break;
            }
            
        }
        return ns;
        
    }
}