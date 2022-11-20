class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = []
        neg = []
        final = []
        c=0
        for i in nums:
            if i>0:
                pos.append(i)
            if i<0:
                neg.append(i)
        n = len(nums)//2
        for i in range(n):
            final.append(pos[c])
            final.append(neg[c])
            c = c+1
        
        return final
            
        
        
         
        