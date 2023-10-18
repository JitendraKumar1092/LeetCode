class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        a = str(x)[::-1]
        return a==x