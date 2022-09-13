class Solution:
    def isPalindrome(self, s: str) -> bool:
        ans = ""
        ans2= ""
        ats=s[::-1]
        for i in ats:
            if i>= 'A' and i<='Z':
                ans += i.lower()
            elif i>= 'a' and i<='z':
                ans += i
            elif i>='0' and i<='9':
                ans += i
        for i in s:
            if i>= 'A' and i<='Z':
                ans2 += i.lower()
            elif i>= 'a' and i<='z':
                ans2 += i
            elif i>='0' and i<='9':
                ans2 += i
        print(ans2)
        return ans==ans2