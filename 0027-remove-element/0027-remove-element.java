class Solution {
    public int removeElement(int[] nums, int val) {
        int ind =-1 , c=0;
        int n = nums.length;
        
        int cp[] = new int[n];
        for ( int i=0; i<n ; i++){
            cp[i] = nums[i];
        }
        
        for (int i:cp){
            if (i!=val){
                nums[++ind] = i;
                c++;
            }
        }
        return c;
    }
}