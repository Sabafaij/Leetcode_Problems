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
                ListNode temp=new ListNode(curr.val);
                curr_l.next=temp;
                curr_l=temp;
            }
            else{
                ListNode temp=new ListNode(curr.val);
                curr_r.next=temp;
                curr_r=temp;
            }
            curr=curr.next;
        }
        curr_l.next=right.next;
        return left.next;
    }
}