class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s = list(set(nums))
        if len(s)>=3:
            return sorted(s)[-3]
        else:
            return max(nums)
        