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
        HashSet<ListNode> set = new HashSet<>();
        ListNode dummy = head;
        while(dummy != null){
           boolean flag=  set.add(dummy);
            dummy = dummy.next;
            if (flag==false) return true;
            
        }
        return false;
    }
}