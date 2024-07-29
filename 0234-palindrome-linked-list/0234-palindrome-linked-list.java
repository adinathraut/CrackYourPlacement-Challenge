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
    public boolean isPalindrome(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        Stack<Integer> st=new Stack<>();
        while(temp2!=null){
            st.push(temp2.val);
            temp2=temp2.next;
        }
        while(temp1!=null)
        {
            if(temp1.val!=st.pop())
            {
                return false;
            }
            temp1=temp1.next;
        }
return true;
        
    }
}