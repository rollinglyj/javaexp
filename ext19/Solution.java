package ext19;

import per.resource.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = head;
        if (head == null) {
            return head;
        }
        if (head.next != null) {
            if (n != 1) {
                for (int i = 0; i < n - 1 && p1.next != null; i++) { // b
                    p1 = p1.next;
                }
            }

            while (p1.next != null) {
                p1 = p1.next;
                p3 = p2;
                p2 = p2.next;

            }
            if (p3 != p2) {
                p3.next = p2.next;
            } else {
                head = head.next;
            }
        } else {
            head = head.next;
            return head;
        }

        return head;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        System.out.println(s1.removeNthFromEnd(l1, 2));
    }
}
