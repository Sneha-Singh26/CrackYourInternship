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
public class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        Node temp = head;
        
        while(temp != null){
            Node nextnode = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = nextnode;
            temp = nextnode;
        }
        temp = head;
        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node newhead = new Node(-1);
        Node copycurrent = newhead;
        Node copy;
        
        while(temp != null){
            copy = temp.next;
            copycurrent.next = copy;
            copycurrent = copy;
            temp.next = copy.next;
            temp = temp.next;
        }
        return newhead.next;
    }
}
