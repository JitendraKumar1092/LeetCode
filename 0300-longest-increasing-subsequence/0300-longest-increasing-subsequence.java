class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxLength=0;
        int [] dp = new int[nums.length];
        
        
        
        for(int key : nums) {
    int i = Arrays.binarySearch(dp, 0, maxLength, key);
    if(i < 0) i = -(i + 1);
    dp[i] = key;
    if(i == maxLength) 
    {maxLength++;
    }
}
        return maxLength;
    }
}