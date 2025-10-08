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
    public void flatten(TreeNode root) {
        TreeNode node = flattenSolve(root);
    }

    public TreeNode flattenSolve(TreeNode node){
        if(node == null){
            return null;
        }
        TreeNode left = flattenSolve(node.left);
        TreeNode right = flattenSolve(node.right);
        if(left != null){
            
            TreeNode temp = node.right;
            node.right = node.left;
            node.left = null;
            left.right = temp;
        }
        if (right != null) return right;
        if (left != null) return left;
        return node;
    }



}