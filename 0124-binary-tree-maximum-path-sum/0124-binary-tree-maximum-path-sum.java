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
    int Sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int res = pathSum(root);
        return Sum;
    }

    public int pathSum(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = Math.max(0, pathSum(root.left));;
        int right =  Math.max(0, pathSum(root.right));
        int sumpath = left + right + root.val;
        Sum = Math.max(Sum, sumpath);
        return Math.max(left, right) + root.val;
    }
}