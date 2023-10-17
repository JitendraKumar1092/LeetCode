/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void func(TreeNode root){
        if (root ==null)
            return ;
         
         TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        func(root.left);
        func(root.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
      
        func(root);
        return root;
        
        
    }
}