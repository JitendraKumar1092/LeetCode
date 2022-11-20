class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if target in nums:
            i1=nums.index(target)
            nums.reverse()
            i2 = nums.index(target)
            i2 = len(nums)-i2-1
            return [i1,i2]
        return[-1,-1]