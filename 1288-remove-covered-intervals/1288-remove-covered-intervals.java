class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int L = intervals.length;
        int p=0,c=0;
        for(int i=0;i<L;i++){            
            for( p=0;p<L;p++){
                if(p==i) continue;
                if(intervals[p][0]<=intervals[i][0] && intervals[p][1]>=intervals[i][1]) {
                    c++;
                    break;
                }                    
            }            
        }
        return (L-c); 
    }
}