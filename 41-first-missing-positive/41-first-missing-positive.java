class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
    while(i<nums.length){
        int indx_value=nums[i]-1;
        if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[indx_value]){
            swap(nums,i,indx_value);
        }else{
            i++;
        }
    }
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
    }
    return nums.length+1;
}
public void swap(int[] nums,int first,int second){
    int temp=nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
}

    }
