class Solution:
    def removeStars(self, s: str) -> str:
        ans=[]
        for x in s:
            if x!='*':
                ans.append(x)
            else:
                ans.pop()
        return ''.join(ans)