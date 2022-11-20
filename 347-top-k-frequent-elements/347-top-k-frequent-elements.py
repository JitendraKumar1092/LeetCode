class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        c=Counter(nums)
       
        c=sorted(c.items(), key=lambda kv:(kv[1], kv[0])) 
        ans,n=[],len(c)
        for i in range(n-1,-1,-1):
            if k==0: break
            ans.append(c[i][0])
            k-=1
        return ans