class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i: nums){
            if(Digit(i))
                c++;
        }
        return(c);
    }
    public boolean Digit(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
    }
    return(c%2==0);
    }
} 