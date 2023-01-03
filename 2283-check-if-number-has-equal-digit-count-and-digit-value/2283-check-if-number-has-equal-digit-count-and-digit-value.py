class Solution:
    def digitCount(self, num: str) -> bool:

        c = Counter(map(int, num))
        return all(c[i] == int(d) for i, d in enumerate(num))        