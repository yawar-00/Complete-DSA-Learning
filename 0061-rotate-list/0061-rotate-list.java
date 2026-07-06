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
        ListNode head1 =null;
        ListNode pre =null;
        if(head==null||head.next==null||k==0){
            return head;
        }
        int i=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        
        ListNode last=temp;
        k=k%i;
        if(k%i==0){
            return head;
        }
        temp=head;
        int j=i-k;
        while(j>0){
            pre = temp;
            temp =temp.next;
            j--;
        }
        ListNode temp2 = head;
        head = temp;
        last.next =temp2;
        pre.next=null;
        return head;
    }
}