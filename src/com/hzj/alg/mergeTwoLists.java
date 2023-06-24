package com.hzj.alg;

public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode a = new ListNode(1,new ListNode(3,new ListNode(6)));
        ListNode b = new ListNode(2,new ListNode(3,new ListNode(6)));
        ListNode listNode = new mergeTwoLists().mergeTwoLists(a, b);
        System.out.println(listNode);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = new ListNode(0);
        ListNode prev = a;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return a.next;
    }
}
