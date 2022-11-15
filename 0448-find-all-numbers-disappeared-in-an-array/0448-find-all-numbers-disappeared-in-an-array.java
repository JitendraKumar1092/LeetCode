class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> list = new ArrayList<>();
        int id = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                id = nums[i]*-1-1;
            }else{
                id = nums[i]-1;
            }
            
            if(nums[id]>0){
                nums[id] = -nums[id];
            }
            
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            };
            
        }
        
        return list;
    
    }
}