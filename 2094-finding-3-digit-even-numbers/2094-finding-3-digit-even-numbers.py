class Solution(object):
    def findEvenNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n = len(digits)
        fre = [0]*10
        for i in range(n):
            fre[digits[i]] += 1
        ans = []
        for i in range(1,10):
            if fre[i]==0: continue 
            fre[i] -= 1
            for j in range(10):
                if fre[j]==0: continue 
                fre[j] -= 1
                for k in range(0,10,2):
                    if fre[k]==0: continue 
                    fre[k] -= 1
                    ans.append(i*100+j*10+k)
                    fre[k] += 1            
                fre[j] += 1        
            fre[i] += 1   
        return ans