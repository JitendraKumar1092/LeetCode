class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;
        long r=(int)Math.sqrt(c);
        while(l<=r){
            if(l*l+r*r==c){
                return true;
            }
            else if(l*l+r*r>c){
                r-=1;
            }
            else{
                l+=1;
            }
        }
        return false;
    }
}

