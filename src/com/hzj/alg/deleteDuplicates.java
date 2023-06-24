package com.hzj.alg;

public class deleteDuplicates {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2,new ListNode(2,new ListNode(3))));
        ListNode listNode1 = new deleteDuplicates().deleteDuplicates(listNode);
        System.out.println(listNode1);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = new ListNode(0,head);
        ListNode cur = first;
        if (head.next == null) {
            return head;
        }
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }else cur = cur.next;
        }
        return first.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        ListNode first = new ListNode(0,head);
        ListNode cur = first;
        if (head.next == null) {
            return head;
        }
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }else cur = cur.next;
        }
        return first.next;
    }
}
