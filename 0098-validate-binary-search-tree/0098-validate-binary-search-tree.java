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
    ArrayList<Integer> ans = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
         if (root != null){
        isValidBST(root.left);
        ans.add(root.val);
        isValidBST(root.right);
        }
        for (int i=1; i<ans.size();i++)
            if (ans.get(i-1)>=ans.get(i))
                return false;
        return true;
        
    }
}