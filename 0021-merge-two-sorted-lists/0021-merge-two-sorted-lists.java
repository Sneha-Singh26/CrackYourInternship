/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode newnode = new ListNode(-1);
        ListNode current = newnode;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                current.next = head1;
                current=head1;
                head1 = head1.next;
           
            }
            else { 
                current.next = head2;
                current = head2;
                head2=head2.next;
            }
        }
        
        if(head1 != null ){
            current.next = head1;
        }
        else{
            current.next = head2;
        }
        return newnode.next;
    }
}

