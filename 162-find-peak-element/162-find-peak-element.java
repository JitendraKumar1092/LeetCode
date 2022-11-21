class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                ans=i;
            }
        }
        return ans;
    }
}