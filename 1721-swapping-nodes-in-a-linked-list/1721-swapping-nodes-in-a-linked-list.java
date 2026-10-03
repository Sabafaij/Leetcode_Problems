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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        int i=1;
        while(i<k){
            fast=fast.next;
            i++;
        }
        ListNode temp=fast;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        i=temp.val;
        temp.val=slow.val;
        slow.val=i;
        return head;
    }
}