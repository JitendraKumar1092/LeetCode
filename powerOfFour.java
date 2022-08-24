class Solution {
    public boolean isPowerOfThree(int n) {
       if (n==0)  return false;
        while(n%4==0) n /= 4;
        if(n==1)  return true;
        else return false;
    }
}
