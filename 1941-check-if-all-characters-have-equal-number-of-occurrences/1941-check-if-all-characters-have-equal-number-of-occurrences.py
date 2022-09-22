class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        lst = list(set(list(s)))
        ans = []
        for i in lst:
            ans.append(s.count(i))
        if len(set(ans))==1:
            return True 
        else:
            return False
            
    
        
        
        