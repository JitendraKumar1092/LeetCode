class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        int swap = 1, keep = 0, n = nums1.length;
        for (int i=1; i<n; i++) {
            int new_swap = n, new_keep = n;  // initialise to maximum possible value
            if (nums1[i] > nums1[i-1] && nums2[i] > nums2[i-1]) {  // case 1
                new_keep = keep < new_keep ? keep : new_keep;
                new_swap = swap+1 < new_swap ? swap+1 : new_swap;
            }
            if (nums1[i] > nums2[i-1] && nums2[i] > nums1[i-1]) {  // case 2
                new_keep = swap < new_keep ? swap : new_keep;
                new_swap = keep+1 < new_swap ? keep+1 : new_swap;
            }
            swap = new_swap;
            keep = new_keep;
        }
        return swap < keep ? swap : keep;
    }
}