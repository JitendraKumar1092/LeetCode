class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        p=0
        n=0
        for i in nums:
            if i<0:
                n = n+1
            if i>0:
                p = p+1
        return max(n,p)
            