class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        counter = 0
        for i in words:
            if i == s[:len(i)]:
                counter = counter +1
        return counter
        