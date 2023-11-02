import java.util.*;
class Solution {
    public int[][] merge(int[][] rrs) {
        
    if (rrs == null || rrs.length <= 1) {
        return rrs;
    }

    Arrays.sort(rrs, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> ans = new ArrayList<>();
    int [] current = rrs[0];
        for  (int i=1; i<rrs.length;i++){
            int [] next = rrs[i];
            if (current[1]>=next[0]){
                current[1]= Math.max(current[1] , next[1]);
                
            }
            else{
                ans.add(current);
                current =next;
            }
            }
            ans.add(current);
        

    return ans.toArray(new int[0][]);

    }
}