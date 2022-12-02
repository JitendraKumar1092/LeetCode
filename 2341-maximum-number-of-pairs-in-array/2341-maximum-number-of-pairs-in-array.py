class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        hashmap = {}
        res = [0, 0]
        
        for i in range(len(nums)):
            if nums[i] in hashmap:
                res[0] += 1
                del hashmap[nums[i]]
				
            else:
                hashmap[nums[i]] = i
        
        res[1] = len(hashmap)
        
        return res
