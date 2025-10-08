/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        root.next = null;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                Node currentNode = q.poll();
                if(i<n-1){
                    currentNode.next = q.peek();
                }
                else{
                    currentNode.next = null;
                }
                if(currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.offer(currentNode.right);
                }
                
            }
            


        }
        return root;
    }
}