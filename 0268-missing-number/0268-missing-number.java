class Solution {
    public int missingNumber(int[] nums) {
        int sum=0 ,mx;
        // boolean flag=true;
        for (int i:nums){
            // if (i<0) flag = false;
            sum+=i;
          
        }
        mx=nums.length;
      
     
        mx = (mx *(mx+1))/2;
        return mx-sum;
        
    }
}