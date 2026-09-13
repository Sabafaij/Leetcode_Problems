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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stk=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            while(!stk.isEmpty() && stk.peek().val<curr.val){
                stk.pop();
            }
            stk.push(curr);
            curr=curr.next;
        }
        ListNode ans=new ListNode(0);
        curr=ans;
        while(!stk.isEmpty()){
            curr.next=stk.pop();
            curr=curr.next;
        }
        curr.next=null;
        curr=ans.next;
        ListNode prev=null;
        while(curr!=null){
            ListNode currnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currnode;
        }
        return prev;
    }
}