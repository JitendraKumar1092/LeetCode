class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int n = nums.length,i=0,pro=1,ct=0;
        for(int j=0;j<n;j++){
            pro*=nums[j];
            if(pro>=k){
                while(pro>=k && i<n){
                    pro/=nums[i];i++;
                }
            }
            if(pro<k) ct+=(j-i+1);
        }
        return ct;
    }
}