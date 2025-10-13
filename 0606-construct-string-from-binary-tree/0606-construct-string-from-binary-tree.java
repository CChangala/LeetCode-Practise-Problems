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
    public String tree2str(TreeNode root) {

        return traverse(root);
    }
    public String traverse(TreeNode root){
        if(root == null){
            return "";
        }

        String left = traverse(root.left);

        String right = traverse(root.right);

         if (left.isEmpty() && right.isEmpty()) {
            return String.valueOf(root.val);
        } else if (right.isEmpty()) {
            return root.val + "(" + left + ")";
        } else if (left.isEmpty()) {
            return root.val + "()" + "(" + right + ")";
        } else {
            return root.val + "(" + left + ")(" + right + ")";
        }
        
    }
}