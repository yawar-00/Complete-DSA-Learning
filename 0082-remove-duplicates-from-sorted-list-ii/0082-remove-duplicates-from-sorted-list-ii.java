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
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null|| head.next ==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev =null;
        boolean duplicate = false;
        while(temp!=null&&temp.next!=null){
            ListNode t1 = temp.next;
            while(t1!=null&&temp.val==t1.val){
                temp.next = t1.next;
                t1= t1.next;
                duplicate =true;
            }
            if(duplicate){
                if(prev==null){
                    head=head.next;
                }
                else
                    prev.next =temp.next;
                duplicate =false;
            }else{
              prev =temp;
            }
            temp =temp.next;
        }
        return head;
    }
}