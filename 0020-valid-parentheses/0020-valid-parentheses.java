class Solution {
    
    
    public static char getval(char ch){
        switch(ch){
            case ']':
                return '[';
            case '}':
                return '{';
            case ')':
                return '(';
            default:
                return ' ';
        }
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String open ="({[";
        String close = "}])";
        for (char i:s.toCharArray()){
            if (open.indexOf(i) != -1)
                stack.push(i);
            else {
                if (stack.isEmpty()) return false;
                 char temp =stack.pop();
                if (getval(i)  != temp)
                    return false;
            }
            
        }
        return stack.isEmpty();
    }
}