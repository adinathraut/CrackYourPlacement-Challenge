/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       //  Map<ListNode,Integer> hmap=new HashMap<>();
       //  ListNode temp=head;
       //  if(head==null) return false;
       //  while(temp.next!=null)
       //  {
       //      if(hmap.containsKey(temp))
       //          return true;
       //      hmap.put(temp,hmap.getOrDefault(temp,0)+1);
       //      temp=temp.next;
       //  }
       // return false;
        
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
           if(slow==fast)
                return true; 
        }
        return false;
    }
}