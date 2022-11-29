class Solution:
    def kthSmallest(self, mat: List[List[int]], k: int) -> int:
        dp = mat[0][:min(k,len(mat[0]))]
        for l in mat[1:]:
            tmp = []
            for i in dp:
                for j in l:
                    tmp += [i+j]
            dp = sorted(tmp)[:min(k,len(tmp))]
        return dp[-1]