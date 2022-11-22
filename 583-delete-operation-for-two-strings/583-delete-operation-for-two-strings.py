class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        n, m = len(word1), len(word2)
        if n == 0 or m == 0:
            return 0

        def findLIS(A):
            s = []
            for num in A:
                j = bisect_left(s, num)
                if j == len(s):
                    s += num,
                else:
                    s[j] = num
            return len(s)

        dp = defaultdict(list)
        for idx, c in enumerate(word1):
            dp[c] += idx,

        arr = []
        for c in word2:
            if c in dp:
                arr += dp[c][::-1]

        lcs = findLIS(arr)
        return n+m-2*lcs

        