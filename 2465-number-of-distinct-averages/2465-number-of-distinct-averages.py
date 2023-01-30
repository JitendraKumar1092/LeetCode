class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        st = set()
        while( len(nums) != 0):
            a = nums.pop(nums.index(max(nums)))
            b= nums.pop(nums.index(min(nums)))
            st.add((a+b)/2)
            
        return len(st)
        