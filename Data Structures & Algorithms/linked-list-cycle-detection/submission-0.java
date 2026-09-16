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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode dummy = head;

        while(dummy != null){
            if(seen.contains(dummy)){
                return true;
            }
            else{
                //dummy.next is not there in seen.
                seen.add(dummy);
                dummy = dummy.next;
            }
        }
        return false;
    }
}
