class Solution {


    public int countDigits(int num) {
        int res = 0;
        for (Character c : Integer.toString(num).toCharArray())
            if (num % (c - '0') == 0)
                res++;
        return res;
    }
}