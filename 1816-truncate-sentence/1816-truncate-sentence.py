class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        arr = s.split()
        s=""
        for _ in arr:
            if(k):
                s = s+_ + " "
                k = k-1
            else:
                break
        return s.strip()