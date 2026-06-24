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
    public ListNode swapPairs(ListNode head) {
         if(head==null||head.next==null){
            return head;
        }
        ListNode prev =null;
        ListNode t1=head;
        while(t1 !=null&&t1.next!=null){
            ListNode t2 =t1.next;
            t1.next =t2.next;
            t2.next =t1;
            if(prev==null){
                head=t2;
            }
            else{
                prev.next=t2;
            }
            prev = t1;
            t1=t1.next;
        }
        return head;
    }
}