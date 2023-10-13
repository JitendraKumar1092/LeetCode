class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String w1 = strs[0];
        String w2 = strs[strs.length-1];
        int n = Math.min(w1.length() , w2.length());
        // System.out.println(n);
        for (int i=0; i<n;i++ ){
            if (w1.charAt(i) == w2.charAt(i)){
                ans +=w1.charAt(i);
            }
            else
                break;
        }
        return ans;
    }
}