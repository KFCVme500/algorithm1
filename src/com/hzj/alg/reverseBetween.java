package com.hzj.alg;

/**
 * 92.反转链表2
 */
public class reverseBetween {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4))));
        ListNode re = new reverseBetween().reverseBetween1(listNode,2,3);
        System.out.println(re);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }
    ListNode pre = null;
    public ListNode reverseBetween1(ListNode head, int left, int right) {
        if (left == 1) {
            //反转前n个链表
            ListNode a = reverseN(head, right);
            return a;
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }
    public ListNode reverseN(ListNode head,int right) {
        if (right == 1) {
            pre = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, right - 1);
        head.next.next = head;
        head.next = pre;
        return last;
    }
}
