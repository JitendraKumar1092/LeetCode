class Solution {
    public boolean repeatedSubstringPattern(String st) {
        String str=st+st;
		String str1=str.substring(1, str.length()-1); 
		if(str1.contains(st)) 				
			return true;
		else
		   return false;
    }
}