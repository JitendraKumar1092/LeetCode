class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        arr = sorted(nums1+nums2)
        n = len(arr)
        first = n//2
        second = first - 1
        if n%2:
            return arr[n//2]
        else:
            c = arr[first]+arr[second]
            c=c/2
            return c
            
        
            
        