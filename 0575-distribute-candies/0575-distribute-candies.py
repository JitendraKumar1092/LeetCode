class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        size = len(candyType)
        st = set(candyType)
        sizeset = len(st)
        return int(min(size/2, sizeset))
        