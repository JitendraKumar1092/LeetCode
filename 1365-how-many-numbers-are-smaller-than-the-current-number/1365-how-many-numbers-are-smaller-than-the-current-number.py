class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        l1 = sorted(nums)
        return [l1.index(i) for i in nums]