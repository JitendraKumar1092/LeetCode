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
        ListNode n = null;
        ListNode curr = null;
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        int remaining = 0;
        while(l1Head != null || l2Head != null){
            int sum = 0;
            if(l1Head != null){
                sum+= l1Head.val;
            }
            if(l2Head != null){
                sum+= l2Head.val;
            }
            sum += remaining;
            int val = (sum) % 10; 
            remaining = (sum) / 10;
            if(n == null){
                n = new ListNode(val);
                curr = n;
            }else{
                ListNode nextNode = new ListNode(val);
                curr.next = nextNode;
                curr = curr.next;
            }
            if(l1Head != null){
                l1Head = l1Head.next;
            }
            if(l2Head != null){
                l2Head = l2Head.next;
            }
        }
        if(remaining != 0){
                ListNode nextNode = new ListNode(remaining);
                curr.next = nextNode;
                curr = curr.next;
        }
        return n;
    }
}