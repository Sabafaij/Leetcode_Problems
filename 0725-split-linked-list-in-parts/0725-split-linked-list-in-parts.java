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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr=new ListNode[k];
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        int n=size/k;
        int rem=size%k;
        for(int i=0;i<k;i++){
            int rec=0;
            ListNode dummy=new ListNode(0);
            ListNode temp=dummy;
            while(curr!=null && rec<n){
                temp.next=curr;
                curr=curr.next;
                temp=temp.next;
                rec++;
            }
            if(rem>0 && curr!=null){
                temp.next=curr;
                curr=curr.next;
                temp=temp.next;
                rem--;
            }
            temp.next=null;
            arr[i]=dummy.next;
        }
        return arr;
    }
}