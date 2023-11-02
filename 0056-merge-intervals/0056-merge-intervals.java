import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        
    if (intervals == null || intervals.length <= 1) {
        return intervals;
    }

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> ans = new ArrayList<>();
    int[] current = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
        int[] next = intervals[i];

        if (current[1] >= next[0]) {
            
            current[1] = Math.max(current[1], next[1]);
        } else {
            
            ans.add(current);
            current = next;
        }
    }

  
    ans.add(current);

    return ans.toArray(new int[0][]);

    }
}