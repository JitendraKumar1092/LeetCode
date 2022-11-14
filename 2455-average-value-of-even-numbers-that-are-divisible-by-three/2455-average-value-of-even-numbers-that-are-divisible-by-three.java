class Solution {
    public int averageValue(int[] nums) {
       int sum = 0, count =0;
        for (int i : nums){
            if ( i % 2 ==0 && i % 3 ==0){
                sum += i;
                count++;
            }
            
        }
        if(count!=0)
        return sum/count;
        return sum;
    }
}