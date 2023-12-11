class Solution {
 
    public int maxProfit(int[] arr) {

     int msf=arr[0] , mx = 0 , t;
        for (int i=0;i<arr.length;i++){
            t = arr[i]-msf;
            mx = Math.max(mx , t);
            msf= Math.min(msf , arr[i]);
            
        }
        // hello
        return mx;
        
}
}