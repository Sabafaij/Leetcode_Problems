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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stk1=new Stack<>();
        Stack<ListNode> stk2=new Stack<>();
        Stack<ListNode> stk=new Stack<>();
        ListNode temp=l1;
        while(temp!=null){
            stk1.push(temp);
            temp=temp.next;
        }
        temp=l2;
        while(temp!=null){
            stk2.push(temp);
            temp=temp.next;
        }
        int carry=0;
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            int sum=carry;
            if(!stk1.isEmpty()){
                sum+=stk1.pop().val;
            }
            if(!stk2.isEmpty()){
                sum+=stk2.pop().val;
            }
            ListNode currSum=new ListNode(sum%10);
            stk.push(currSum);
            carry=sum/10;
        }
        if(carry>0){
            ListNode currSum=new ListNode(carry);
            stk.push(currSum);
        }
        ListNode dummy=new ListNode(0);
        temp=dummy;
        while(!stk.isEmpty()){
            temp.next=stk.pop();
            temp=temp.next;
        }
        return dummy.next;
    }
}