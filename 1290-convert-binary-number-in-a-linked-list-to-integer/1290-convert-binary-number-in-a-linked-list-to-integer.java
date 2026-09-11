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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stk=new Stack<>();
        while(head!=null){
            stk.push(head.val);
            head=head.next;
        }
        int ans=0;
        int pwr=0;
        while(!stk.isEmpty()){
            ans+=stk.pop()*Math.pow(2,pwr++);
        }
        return ans;
    }
}