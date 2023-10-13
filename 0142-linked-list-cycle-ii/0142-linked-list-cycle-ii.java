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
    public ListNode detectCycle(ListNode head) {
         HashSet<ListNode> set = new HashSet<>();
        // ListNode slow = new ListNode();
        // slow.next=head;
        ListNode ans = null;
        boolean flag;
        while(head != null){
            flag=  set.add(head);
            
            if (flag==false)
                return head;
             head = head.next;
        }
        
       
    
         return null;
}
}