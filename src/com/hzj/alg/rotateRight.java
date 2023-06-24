package com.hzj.alg;

/**
 * 61.旋转链表
 */
public class rotateRight {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3, new ListNode(2, new ListNode(1)));
        new rotateRight().rotateRight(listNode,2);
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int n = 1;
        ListNode iter = head;
        while (iter.next != null) {
            n++;
            iter = iter.next;
        }
        int add = n - k%n;
        if (add == n) {
            return head;
        }
        System.out.println(iter.val);
        //闭合为环
        iter.next = head;
        while (add > 0) {
            iter = iter.next;
            add--;
        }
        ListNode ret = iter.next;
        iter.next = null;
        return ret;
    }
}
