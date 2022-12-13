class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        a = s.split()
        s=""
        for _ in a:
            if(k):
                s = s+_ + " "
                k = k-1
            else:
                break
        return s.strip()