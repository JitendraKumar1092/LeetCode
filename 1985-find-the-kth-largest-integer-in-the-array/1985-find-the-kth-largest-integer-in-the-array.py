class Solution:
    def kthLargestNumber(self, nums: List[str], k: int) -> str:
        ls = []
        for i in nums:
            ls.append(int(i))
        return str(sorted(ls)[-k])