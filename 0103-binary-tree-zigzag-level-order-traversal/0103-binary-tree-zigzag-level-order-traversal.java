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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean right = true;

        while(!q.isEmpty()){
            int n = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for(int i = 0; i < n; i++){
                TreeNode currentNode = q.poll();
                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }

                if(right){
                    list.addLast(currentNode.val);
                }
                else{
                    list.addFirst(currentNode.val);
                }
                
            }
            right = !right;
            res.add(list);
        }
        return res;
    }
}