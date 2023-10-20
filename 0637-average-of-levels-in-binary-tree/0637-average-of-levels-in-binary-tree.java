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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null) return res;
         Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> levelValues = new ArrayList<>();

        for (int i = 0; i < levelSize; i++) {
            TreeNode curr = queue.poll();
            levelValues.add(curr.val);

            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

        ans.add(levelValues);
    }
          
     
        for(List<Integer> i: ans){
            double sum=0;
            int a = i.size();
            for (int j : i){
                sum+=j;
            }
            res.add(sum/a);
        }
        return res;
    }
}