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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            head=null;
            return head;
        }
        // ListNode temp = head;
        // ListNode pre = temp;
        // for(int i=0; i<=n;i++){
        //     pre = temp;
        //     temp =temp.next;
            
        // }
        // if(temp.next == null){
        //     return head;
        // }
        // if(temp.next!=null){
        //     pre.next= temp.next;
        // }
        // return head;
        ListNode temp = head;
        int count =1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        int i = count - n;
        count =1;
        temp= head;
        if(i==0){
            head =head.next;
            return head;
        }
        while(temp.next!=null){
            
            if(count==i){
                if(temp.next.next!=null){
                    temp.next=temp.next.next;
                }
                else{
                    temp.next=null;
                    break;
                }
            }
            temp=temp.next;
            count++;
        }
        return head;
        
    }
}