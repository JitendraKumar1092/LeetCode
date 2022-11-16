class Solution:
    def detectCapitalUse(self, s: str) -> bool:
        if s == s.lower():
            return True
        if s == s.upper():
            return True
        if s == s.title():
            return True
        return False