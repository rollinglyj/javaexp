package ext160;

import per.resource.ListNode;

public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) {
        return null;
    }
    int Alen = 0;
    int Blen = 0;
    ListNode p1 = headA;
    ListNode p2 = headB;
    while(p1 != null) {
        p1 = p1.next;
        Alen++;
    }
    while(p2 != null) {
        p2 = p2.next;
        Blen++;
    }
    p1 = headA;
    p2 = headB;
    int count = 0;
    if(Alen > Blen) {
        while(count < Alen - Blen) {
            p1 = p1.next;
            count++;
        }
    }
    if(Alen < Blen) {
        while(count < Blen - Alen) {
            p2 = p2.next;
            count++;
        }
    }
    while(p1 != null && p2 != null) {
        if(p1 == p2) {
            return p1;
        }
        p1 = p1.next;
        p2 = p2.next;
    }
    
    return null;
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
        System.out.println(s1.getIntersectionNode(l1, l3));
    }
}
