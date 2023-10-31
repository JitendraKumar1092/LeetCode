class Solution {
    public int maxProfit(int[] a) {
        int mx = 0, n = a.length;
        for ( int i=1 ; i<n ;i++){
            if (a[i] > a[i-1]){
                mx += a[i]-a[i-1];
            }
            
            
        }
        return mx;
    }
}