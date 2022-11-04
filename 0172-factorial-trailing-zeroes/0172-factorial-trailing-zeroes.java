class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
     
        ans+=n/5;
        ans+=n/25;
        ans+=n/125;
        ans+=n/625;
        ans+=n/3125;
        ans+=n/15625;
		
        return ans;
    }}