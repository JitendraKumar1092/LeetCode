class Solution:
    def hammingWeight(self, n: int) -> int:
        # return bin(n)[2:].count('1') one line
        cnt =0
        while n:
            if n&1:
                cnt+=1
            n >>= 1
        return cnt

        