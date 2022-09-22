class Solution:
    def reverseWords(self, s: str) -> str:
        lst = list(s.split())
        ns=""
        for i in lst:
            ns += i[::-1]
            ns += " "
        return ns.strip() 
            
        