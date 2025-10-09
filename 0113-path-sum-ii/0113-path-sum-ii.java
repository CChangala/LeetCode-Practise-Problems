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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        PathSums(root,targetSum,0,output,res);
        return res;
    }
    
    public void PathSums(TreeNode root, int targetSum,int current,List<Integer> output,List<List<Integer>> res){
        if(root == null){
            return;
        }
        current = current + root.val;
        output.add(root.val);
        if(current == targetSum && root.left == null && root.right == null){
            res.add(new ArrayList<>(output));
        }

        PathSums(root.left, targetSum,current,output,res);
        PathSums(root.right,targetSum,current,output,res);

        output.remove(output.size() - 1);
    }
}