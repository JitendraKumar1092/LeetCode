class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        pf =""
        for i in range(len(strs[0])):
            if strs[0][i] == strs[len(strs)-1][i]:
                pf += strs[0][i]
            else:
                break
        return pf
        