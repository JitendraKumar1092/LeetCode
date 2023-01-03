class Solution:
    def digitCount(self, nums: str) -> bool:

        c = Counter(map(int, nums))
        return all(c[i] == int(d) for i, d in enumerate(nums))        