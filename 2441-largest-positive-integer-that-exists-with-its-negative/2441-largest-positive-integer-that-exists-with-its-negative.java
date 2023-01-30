class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> hs = new HashSet();
        int max = -1;
        for(int i=0;i<nums.length;++i){
            hs.add(nums[i]);
            if(hs.contains(nums[i]*-1))     max = Math.max(max , Math.max(nums[i],nums[i]*-1));
        }
        return max;
    }
}