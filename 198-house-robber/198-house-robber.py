class Solution:

    def rob(self, nums):
        dp1 = dp2 = 0
        for _ in nums: 
            dp2, dp1 = dp1, max(dp1, dp2 + _)
        return dp1