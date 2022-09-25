class Solution {
    int count=0, min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return min; 
    }
    public void dfs(TreeNode node){
        count++;
        if(node.left==null && node.right==null){
            if(count<min){
                min=count;
            }
        }

        if(node.left!=null){
            dfs(node.left);
            count--;
        }
        if(node.right!=null){
            dfs(node.right);
            count--;
        }
    }
}