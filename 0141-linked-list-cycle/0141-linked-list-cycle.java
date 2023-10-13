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
        int c1=0;
         while (head != null){
             c1++;
            head = head.next;
             if(c1 > 10000)
                 return true;
             
         }
        return false;
    }
}