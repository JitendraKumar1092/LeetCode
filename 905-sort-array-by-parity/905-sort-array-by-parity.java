class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
     int arr [] = new int[nums.length];
        int idx=0;
        for(int i:nums){
            if (i%2==0)
                arr[idx++] =i;
        }
         for(int i:nums){
            if (i%2==1)
                arr[idx++] =i;}
        return arr;
        
    }
}