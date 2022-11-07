class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        s = ''.join([str(elem) for elem in nums])
        lst = s.split('0')
        c=0
        for _ in lst:
            if len(_)>c:
                c=len(_)
        return c