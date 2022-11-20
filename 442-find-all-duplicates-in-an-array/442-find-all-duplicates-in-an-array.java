class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int[] arr=new int [n];
        
        for(int i=0;i<n;i++){
            int x=nums[i];
            arr[x-1]++;
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                l.add(i+1);
            }
        }
        return l;
    }
}