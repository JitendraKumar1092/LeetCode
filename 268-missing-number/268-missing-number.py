class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        for item in range(0, len(nums) + 1):
        
            if item not in nums:
                 return item