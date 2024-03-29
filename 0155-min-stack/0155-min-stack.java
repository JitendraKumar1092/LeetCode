class MinStack {
    Stack <Long> st ;
    Long mini;
    public MinStack() {
       st = new Stack<Long>();
        mini = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long vl = Long.valueOf(val);
        
        if (st.isEmpty()){
            mini = vl;
            st.push(vl);
        }
        else {
            if (vl<mini){
                st.push(2*vl-mini);
                mini=vl;
            }
            else {
                st.push(vl);
            }
        }
    }
//     public void push(int val) {
//     Long vl = Long.valueOf(val);

//     if (st.isEmpty()) {
//         mini = vl;
//         st.push(vl);
//     } else {
//         if (vl < mini) {
//             st.push(2 * vl - mini);
//             mini = vl;
//         } else {
//             st.push(vl);
//         }
//     }
// }
    
    public void pop() {
        if (st.isEmpty()) 
            return ;
        Long vl = st.pop();
        if (vl<mini){
            mini = 2 * mini - vl;
        }
        
    }
    
    public int top() {
        Long vl = st.peek();
       if (vl < mini) {
            return mini.intValue();
        }
        return vl.intValue();

    }
    
    public int getMin() {
        return mini.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */