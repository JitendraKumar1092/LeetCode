class Solution:
    def longestPalindrome(self, s: str) -> int:
        hasht={}
        count=0
        for i in s:
            if i in hasht:
                if hasht[i]==1:
                    count+=2
                    hasht.pop(i)
                else:
                    hasht[i]=hasht[i]+1
            else:
                hasht[i]=1
        if len(hasht)>=1:
            print(hasht)
            count+=1
        return count