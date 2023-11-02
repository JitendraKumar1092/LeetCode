class Solution {
    public int[][] insert(int[][] rrs, int[] t) {
   
    

    List<int[]> ans = new ArrayList<>();
        
        for ( int[] i:rrs){
            ans.add(i);
        }
        ans.add(t);
         int[][] arr = ans.toArray(new int[0][]);
        ans.clear();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
    int [] current = arr[0];
        for  (int i=1; i<arr.length;i++){
            int [] next = arr[i];
            if (current[1]>=next[0]){
                current[1]= Math.max(current[1] , next[1]);
                
            }
            else{
                ans.add(current);
                current =next;
            }
            }
            ans.add(current);
        

    return ans.toArray(new int[0][]);
        
    }
}