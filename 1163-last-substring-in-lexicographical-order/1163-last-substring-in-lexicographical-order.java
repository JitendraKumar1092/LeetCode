class Solution {
    public String lastSubstring(String s) {
        int left = 0;
        int max = 0;
        String result = "";
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) - s.charAt(left) >= 0) {
              
                String pre = s.substring(left, i);
                if (result.compareTo(pre) < 0) {
                    result = pre;
                    max = left;
                }
                left = i;
            }
            while(i != s.length() -1 && s.charAt(i) == s.charAt(i+1)) i++; 
            
        }
       
        if (result.compareTo(s.substring(left, s.length())) < 0) {
            max = left;
        }
        
        if (max == 1 && s.charAt(max) == s.charAt(0)) max = 0;        
        return s.substring(max, s.length());
    }
}