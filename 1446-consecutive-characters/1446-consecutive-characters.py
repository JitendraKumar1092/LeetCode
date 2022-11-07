class Solution:
    def maxPower(self, s: str) -> int:
        li = 0
        p = 1
        
        for i in range(1, len(s)):
            if s[li] != s[i]:
                p = max(p, i - li)
                li = i
        return max(p, len(s) - li)