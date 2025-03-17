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
    public int maxDepth(TreeNode root) {
         if (root == null ) 
        return 0;
        Solution s = new Solution();
        int leftDepth = s.maxDepth(root.left);
        int rightDepth = s.maxDepth(root.right);
        return 1 + Math.max(leftDepth , rightDepth);
    }
}