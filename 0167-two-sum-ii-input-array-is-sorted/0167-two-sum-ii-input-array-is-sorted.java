class Solution {
  
    public int[] twoSum(int[] nums, int num) {
        int n = nums.length;
        
     
         int []arr = new int[2];
     
        int i=0 , j=n-1 ,sum;
        while ( i<j ){
            sum = nums[i] + nums[j];
            if(sum==num){
                arr[0]= i+1;//indexOf(nums ,nums[i]);
                arr[1]= j+1;//indexOf(nums ,nums[j]);
                break;
            }else if(sum<num){
                i++;
            }
            else{
                j--;
            }
            
        }
        return arr;
        }
    }
