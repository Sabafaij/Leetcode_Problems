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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1=list1;
        while(l1!=null && a>1){
            l1=l1.next;
            a--;
            b--;
        }
        ListNode prev=l1;
        
        while(l1!=null && b>=0){
            l1=l1.next;
            b--;
        }
        prev.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=l1;
        return list1;
    }
}