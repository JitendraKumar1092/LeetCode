class Solution {
    public int arraySign(int[] nums) {
        int p=0,n=0,z=0;
        for(int i:nums){
            if(i==0)
                return 0;
            if (i<0)
                n++;
            if (i>0)
                p++;
        }
        if (n%2==0)
            return 1;
        return -1;
    }
}