class Solution {
    public String reverseWords(String s) {
        
        String [] wa = s.split("\\s+");
        int n = wa.length;
        String temp;
        for (int i=0, j=n-1;i<j;i++ , j--){
            temp = wa[i];
            wa[i] = wa[j];
            wa[j] = temp;
        }
        String ans ="";
        for (String w : wa){
            ans += w  + " ";
            
        }
        return ans.strip();
        
    }
}