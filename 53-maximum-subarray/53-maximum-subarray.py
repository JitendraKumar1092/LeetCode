# int maxSum = nums[0];
#         int currSum = 0;
        
#         for (int num : nums){
#             if (currSum < 0){
#                 currSum = 0;
#             }
#             currSum += num;
#             maxSum = Math.max (maxSum, currSum);
#         }
        
#         return maxSum;


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        ms=nums[0]
        cs=0
        for i in nums:
            if cs<0:
                cs=0
            cs = cs + i
            ms = max(ms,cs)
        return ms