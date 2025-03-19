class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mnp = float('inf')
        mxp=0
        for i in range(0, len(prices)):
            if mnp > prices[i]:
                mnp = prices[i]
            elif (prices[i] - mnp) > mxp:
                mxp = prices[i] - mnp
        return mxp
        