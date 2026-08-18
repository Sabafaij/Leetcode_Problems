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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int cnt=0;
        while(curr!=null){
            cnt++;
            curr=curr.next;
        }
        ListNode[] arr=new ListNode[cnt];
        if(cnt<k || k==1){
            return head;
        }
        curr=head;
        for(int j=0;j<cnt;j++){
            arr[j]=curr;
            curr=curr.next;
        }
        int i=0;
        while(i+k<=cnt){
            int s=i;
            int e=i+k-1;
            while(s<e){
                ListNode temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            i+=k;
        }
        head=arr[0];
        curr=head;
        for(i=1;i<cnt;i++){
            curr.next=arr[i];
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    
}