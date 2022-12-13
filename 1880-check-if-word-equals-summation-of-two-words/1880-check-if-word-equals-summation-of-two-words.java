class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f = 0;
    
    int s = 0;
    
    int t = 0;
    
    for(char ch : firstWord.toCharArray()){
        
        f = (f*10) + (ch -'a');
    }
    
    for(char ch : secondWord.toCharArray()){
        
        s = (s*10) + (ch - 'a');
    }
    
    for(char ch : targetWord.toCharArray()){
        
        t = (t*10) + (ch - 'a');
    }
        
    if((f+s) == t){
        
        return true;
    }
    
    return false;
    

    }
}