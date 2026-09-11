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
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }

        int[] arr=new int[size];
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        Stack<Integer> stk=new Stack<>();
        for(int j=size-1;j>=0;j--){
            while(!stk.isEmpty() && stk.peek()<=arr[j]){
                stk.pop();
            }
            int num=arr[j];
            if(!stk.isEmpty()){
                arr[j]=stk.peek();
            }
            else{
                arr[j]=0;
            }
            stk.push(num);
        }
        return arr;
    }
}