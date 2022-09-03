class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        while(--n > 0){
            List<Integer> tmp = new ArrayList();
            for(int val: list){
                int rem = val % 10;
                if(rem + k < 10)     tmp.add(val * 10 + rem + k);
                if(k != 0 && rem - k >= 0)   tmp.add(val * 10 + rem - k);
            }
            list = tmp;
        }
        return list.stream().mapToInt(j->j).toArray();
    }
}