# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def helper(f , s):
            if f == s:
                return True
            if f is None or s is None or f.val!= s.val:
                return False
            return helper(f.left , s.right) and helper(f.right , s.left)
        return helper(root.left , root.right)
        