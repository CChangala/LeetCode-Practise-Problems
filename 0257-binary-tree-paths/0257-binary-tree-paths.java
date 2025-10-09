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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        bTP(root,"",res);
        return res;
    }

    public void bTP(TreeNode root, String p, List<String> res){
        if(root == null){
            return;
        }
       
        if(p!=""){
            p = p + "->" + root.val;
        }
        else{
             p = p + root.val;
        }
        if(root.left == null & root.right == null){
            res.add(p);
        }
        bTP(root.left,p,res);
        bTP(root.right,p,res);
    }
}