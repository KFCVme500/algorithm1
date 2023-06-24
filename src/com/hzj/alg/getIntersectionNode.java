package com.hzj.alg;

import java.util.LinkedList;

/**
 * 160.相交链表
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        LinkedList a = new LinkedList();

        return pA;

    }
}
