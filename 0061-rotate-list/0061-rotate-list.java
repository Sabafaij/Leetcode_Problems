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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode tail=head;
        int size=1;
        while(tail.next!=null){
            size++;
            tail=tail.next;
        }
        if(k%size==0){
            return head;
        }
        ListNode curr=head;
        for(int i=0;i<size-k%size-1;i++){
            curr=curr.next;
        }
        ListNode newhead=curr.next;
        curr.next=null;
        tail.next=head;
        return newhead;
        
    }
}