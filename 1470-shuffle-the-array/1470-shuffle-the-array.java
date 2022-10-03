class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] arr = new int[2*n];
        int i = 0; int j = 0;
        while(i<n){
            arr[i] = nums[j];
            i++;
            j++;
            arr[i] = nums[n];
            i++;
            n++;
        
        }
        return arr;
}}