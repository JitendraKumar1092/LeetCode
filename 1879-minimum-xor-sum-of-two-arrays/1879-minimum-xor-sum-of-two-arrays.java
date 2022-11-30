class Solution {
    public int minimumXORSum(int[] nums1, int[] nums2) {
       
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        int n = nums1.length;
        
       
        int[][] dp = new int[n][(1<<n)+1];
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0) map.put(i, new HashMap<Integer,Integer>());
                int temp = nums1[i] ^ nums2[j];
                map.get(i).put((1<<j), temp);
                
                if (i==0) dp[i][(1<<j)] = temp;
            }
        }
        
        
        
        for (int i=0;i<dp.length-1;i++){
            for (int j=0;j<dp[0].length;j++){
                if (dp[i][j] == Integer.MAX_VALUE) continue;
                HashMap<Integer,Integer> map2 = map.get(i+1);
                for (int bitcode: map2.keySet()) {
                    if ((bitcode & j) == 0){
                        dp[i+1][bitcode|j] = Math.min(dp[i+1][bitcode|j], dp[i][j] + map2.get(bitcode));
                    }
                }
            }
        }
        
        
        return dp[n-1][(1<<n)-1];
        
        
    }
}