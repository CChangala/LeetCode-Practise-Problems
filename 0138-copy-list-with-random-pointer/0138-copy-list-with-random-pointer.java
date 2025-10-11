/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

       /**  Node currOld = head.next;
        Node newHead = new Node(head.val);
        Node currNew = newHead;

        while(currOld!=null){
            Node curr = new Node(currOld.val);
            currNew.next = curr;
            if(currOld.random != null){
                curr.
            }
            currOld = currOld.next;
            currNew = currNew.next;
        }
        
        return newHead;*/
        //for each node I'll create a copy and store in map;

        Node curr = head;
        HashMap<Node,Node> map = new HashMap<>();
        while(curr!=null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node currNew = map.get(curr);
            currNew.next = map.get(curr.next);
            currNew.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}