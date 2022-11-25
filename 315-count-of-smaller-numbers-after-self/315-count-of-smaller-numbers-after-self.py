from sortedcontainers import SortedList

class Solution:
    def countSmaller(self, nums: list[int]) -> list[int]:
        
        
        seen = SortedList([])
        counts = []
        
        for n in reversed(nums):
            counts.append(seen.bisect_left(n))
            seen.add(n)
        
        return reversed(counts)
