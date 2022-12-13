class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    int count = 0;

        for(String str : words){
            int check = 0;
                for(int j = 0; j < str.length(); j++){
                    if(allowed.contains(String.valueOf(str.charAt(j)))){
                        check++;
                    }
                }
                if(check == str.length()){
                    count++;
                }
        } 
    
    
    return count;
    }
    
}