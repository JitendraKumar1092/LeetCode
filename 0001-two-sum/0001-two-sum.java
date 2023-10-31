class Solution {
 
    public int[] twoSum(int[] nums, int num) {
        Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int needed = num - nums[i];
        if (map.containsKey(needed)) {
            return new int[]{map.get(needed), i};
        }
        map.put(nums[i], i);
    }

    return new int[]{-1, -1};
    }
}