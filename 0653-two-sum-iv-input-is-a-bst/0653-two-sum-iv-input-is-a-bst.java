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
    ArrayList<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        if(res.size()==0){
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        for(int i = 0; i< res.size(); i++){
            int comp = k - res.get(i);
            if(map.containsKey(comp)){
                return true;
            }
            else{
                map.put(res.get(i), i);
            }
        }
        return false;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }


}