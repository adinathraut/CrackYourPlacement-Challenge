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
        ListNode temp=head;
        //int prev=temp.val;
        while(temp!=null && temp.next!=null)
        {
            if(temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
               // prev=temp.val;
                //temp=temp.next;
            }
            else
            {
               // prev=temp.val;
                temp=temp.next;
            }
        }
        return head;
    }
}