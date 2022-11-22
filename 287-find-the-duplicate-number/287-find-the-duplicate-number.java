class Solution {
    public int findDuplicate(int[] nums) {
        
    
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int num : nums){
            
            
            if(!set.add(num)){
                //Returning Duplicate
                return num;
            }
        }
        
        
        return -1;
    }
}