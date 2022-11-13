
class Solution:
    def reverseWords(self, s: str) -> str:
        st = s.strip()
        lst = reversed(st.split())
        ans = ""
        for i in lst:
            ans = ans + i
            ans = ans + " "
        return ans.strip()
            
        