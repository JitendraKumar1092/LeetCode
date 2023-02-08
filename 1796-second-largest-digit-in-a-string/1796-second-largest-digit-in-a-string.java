class Solution {
    public int secondHighest(String s) {
        
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                set.add(Character.getNumericValue(c));
        }
        int arr [] = new int[set.size()];
        int n=0;
        for ( int i: set)
            arr[n++] = i;
        if (arr.length==0 || set.size() == 1)
            return -1;
        
    
    Arrays.sort(arr);
        return arr[arr.length-2];
}}