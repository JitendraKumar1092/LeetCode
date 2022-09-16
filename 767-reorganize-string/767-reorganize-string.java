class Solution {
    public String reorganizeString(String s) {
         int n = s.length(), maxFreq = 0, maxLetter = -1;
        int[] map = new int[26];
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            map[c] += 1;
            if (map[c] > maxFreq) {
                maxFreq = map[c];
                maxLetter = c;
            }
        }
        
        if (maxFreq - 1 > n - maxFreq) return "";
        char[] res = new char[n];
        int index = 0;
        while (map[maxLetter] != 0) {
            res[index] = (char) ('a' + maxLetter);
            map[maxLetter] -= 1;
            index += 2;
        }
        
        for (int i = 0; i < 26; i++) {
            while (map[i] != 0) {
                if (index >= n) index = 1;
                res[index] = (char) ('a' + i);
                map[i] -= 1;
                index += 2;
            }
        }
        return new String(res);
    }
}