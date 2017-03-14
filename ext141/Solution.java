package ext141;

import per.resource.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head, p2 = head;
        while(p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
            if(p2 != null) {
                p2 = p2.next;
            }
            if(p1 == p2 && p2 != null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l2;
        l4.next = null;
        System.out.println(s1.hasCycle(l1));
    }
}
