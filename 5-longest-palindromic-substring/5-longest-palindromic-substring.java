class Solution {
  public String longestPalindrome(String s) {
    // return expand(s);
    return dp(s);
  }
  
  public String dp(String s) {
    boolean[][] dp = new boolean[s.length()][s.length()];
    int max = 0;
    int left = 0;
    int right = 1;
    for(int i = 0 ; i < s.length(); i++) {
      for(int j = 0; j <= i; j++) {
        boolean res = s.charAt(i) == s.charAt(j);
        // if there are at least 4 characters in the substring
        dp[j][i] = i - j > 2 ? res && dp[j+1][i-1] : res;
        if(dp[j][i] && i - j + 1 > max) {
          max = i - j + 1;
          left = j;
          right = i + 1;
        }
      }
    }
    
    return s.substring(left, right);
  }
  
  public String expand(String s) {
    int max = 1;
    int leftIndex = 0;
    int rightIndex = 1;
    for(int i = 1; i < s.length(); i++) {
      int left = i - 1;
      int right = i + 1;
      int cur = 1;
      while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        cur+=2;
        if(cur > max) {
          max = cur;
          leftIndex = left;
          rightIndex = right + 1;
        }
        left--;
        right++;
      }
      
      cur = 0;
      left = i - 1;
      right = i;
      while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        cur+=2;
        if(cur > max) {
          max = cur;
          leftIndex = left;
          rightIndex = right + 1;
        }
        left--;
        right++;
      }
    }
    
    return s.substring(leftIndex, rightIndex);
  }
}