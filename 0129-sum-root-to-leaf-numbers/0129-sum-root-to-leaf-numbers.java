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
    public int sumNumbers(TreeNode root) {
        List<String> path = new ArrayList<>();
        sumNumber(root,"",path);
        int sum = 0;
        for(int i = 0; i<path.size();i++){
            sum = sum + Integer.parseInt(path.get(i));
        }
        return sum;
    }

    public void sumNumber(TreeNode root,String path, List<String> allPaths){
        if(root == null){
            return;
        }
        path = path + root.val;
        if(root.left == null && root.right == null){
            allPaths.add(path);
        }
        sumNumber(root.left,path,allPaths);
        sumNumber(root.right,path,allPaths);
    }
}