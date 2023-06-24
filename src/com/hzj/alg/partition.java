package com.hzj.alg;

/**
 * 86分隔链表
 */
public class partition {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5,new ListNode(2))))));
        ListNode partition = new partition().partition1(listNode, 3);
        System.out.println(partition);
    }
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            }else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }

    public ListNode partition1(ListNode head, int x) {
        ListNode pre = new ListNode(0);
        ListNode preHead = pre;
        ListNode cur = new ListNode(0);
        ListNode curHead = cur;
        while (head != null) {
            if (head.val > x) {
                cur.next = head;
                cur = cur.next;
            }else {
                pre.next = head;
                pre = pre.next;
            }
            head = head.next;
        }
        cur.next = null;
        pre.next = curHead.next;
        return preHead.next;
    }
}
