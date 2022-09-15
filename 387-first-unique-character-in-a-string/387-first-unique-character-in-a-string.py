class Solution:
    def firstUniqChar(self, s: str) -> int:
        a=-1
        for i in s:
            a=s.count(i)
            if a<2:
                return s.index(i)
        return -1
                
                
                
            
        