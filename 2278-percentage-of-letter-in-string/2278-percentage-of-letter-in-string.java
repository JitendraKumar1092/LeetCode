class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for (char c :s.toCharArray())
            if(c==letter)
                count++;
        int p = (count*100)/s.length();
        return p;
    }
}