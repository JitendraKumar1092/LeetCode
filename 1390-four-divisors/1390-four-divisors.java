class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int j = 0; j < nums.length; j++){
            int sum = 0, count = 0;
            for(int i = 1; i*i <= nums[j]; i++){
                if(nums[j]%i == 0 && i != nums[j]/i){
                    count += 2;
                    sum = sum + i + nums[j]/i;
                }
                else if(nums[j]%i == 0 && i == nums[j]/i){
                    count += 1;
                    sum += i;
                }
                if(count > 4) break;
            }
            if(count == 4){
                totalSum += sum;
            }
        }
        return totalSum;
    }
}
