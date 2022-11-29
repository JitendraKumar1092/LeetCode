class Solution {
    private int lis(List<Integer> nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums.get(0));
        
        for (int i = 1; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num >= sub.get(sub.size() - 1)) {
                sub.add(num);
            } else {
                int j = Collections.binarySearch(sub, num) + 1;
                if (j < 0) {
                    j = -(j + 1) + 1;
                }
                sub.set(j, num);
            }
        }
        return sub.size();
    }
    
    public int kIncreasing(int[] arr, int k) {
        int total = 0;
        
        for (int i = 0; i < k; i++) {
            List<Integer> nums = new ArrayList<>();
            for (int j = i; j < arr.length; j += k) {
                nums.add(arr[j]);
            }
            total += nums.size() - lis(nums);
        }
        return total;
    }
}