class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        if sorted(nums) == sorted(list(set(nums))):
            return False
        else:
            return True
        