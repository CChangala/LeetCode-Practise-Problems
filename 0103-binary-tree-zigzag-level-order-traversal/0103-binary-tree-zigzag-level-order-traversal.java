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
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean right = true;

        while(!q.isEmpty()){
            LinkedList<Integer> currentLevel = new LinkedList<>();
            int n = q.size();
            for(int i = 0; i<n;i++){
                TreeNode currentNode = q.poll();
                if (right) currentLevel.addLast(currentNode.val);
                else currentLevel.addFirst(currentNode.val);
                if(currentNode.left != null ){
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }
                //currentLevel.add(currentNode.val);
                
            }
            right = !right;
            result.add(currentLevel);
        }
        return result;
    }
}