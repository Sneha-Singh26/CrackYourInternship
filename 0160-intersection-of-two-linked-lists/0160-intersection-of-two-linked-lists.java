/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode current1 = headA;
    ListNode current2 = headB;
        while(current1 != current2){
            current1 = current1.next;
            current2 = current2.next;
            
            if(current1 == current2){
                return current1;
            }
            
            if(current1 == null){
                current1 = headB;
            }
            
            else if (current2 == null){
                current2 = headA;
            }
        }
    return current1;
    }
}
