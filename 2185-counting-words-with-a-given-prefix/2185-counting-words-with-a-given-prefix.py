class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        lnt = len(pref)
        counter = 0
        for i in words:
            if i[:lnt] == pref:
                counter = counter +1
        return counter
            
            
        