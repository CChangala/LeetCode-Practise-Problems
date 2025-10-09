/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    public Node treeToDoublyList(Node root) {
       binaryTree(root);
       if (res.size() == 0){
        return null;
       }
       Node head = new Node(res.get(0));
        Node prev = head;
        
        for (int i = 1; i < res.size(); i++) {
            Node curr = new Node(res.get(i));
            prev.right = curr;
            curr.left = prev;
            prev = curr;
        }
        
        // Step 3: make it circular
        Node tail = prev;
        head.left = tail;
        tail.right = head;
        
        return head;
    }

    public void binaryTree(Node root){
        if(root == null){
            return;
        }
        binaryTree(root.left);
        res.add(root.val);
        binaryTree(root.right);

    }
}