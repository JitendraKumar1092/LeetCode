class Solution:
    def capitalizeTitle(self, s: str) -> str:
        ans = ""
        for i in s.split():
            if len(i)>2:
                ans = ans + i.lower().title()
            elif len(i)==1:
                ans = ans + i.lower()
            elif len(i)==2:
                ans = ans+i.lower()
            ans = ans + " "
        return ans.strip()