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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode curr=head;
        ListNode curr_l=left;
        ListNode curr_r=right;
        while(curr!=null){
            if(curr.val<x){
                
                curr_l.next=curr;
                curr_l=curr;
            }
            else{
                curr_r.next=curr;
                curr_r=curr;
            }
            curr=curr.next;
        }
        curr_r.next=null;
        curr_l.next=right.next;
        return left.next;
    }
}