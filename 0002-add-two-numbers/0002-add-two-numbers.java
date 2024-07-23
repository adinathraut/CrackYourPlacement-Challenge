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
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        int carry=0;
        int num1=0,num2=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            num1=(l1==null) ?0: l1.val;
            num2=(l2==null) ?0:l2.val;
        
            int sum=num1+num2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode add=new ListNode(digit);
            ans.next=add;
            ans=ans.next;

           if(l1!=null) l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        ans.next=null;
        
        return temp.next;
    }
}