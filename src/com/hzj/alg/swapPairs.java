package com.hzj.alg;

/**
 * 24.两两交换链表中的节点
 */
public class swapPairs {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(6)));
        new swapPairs().swapPairs1(listNode);
    }
    //递归解法
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return head;
    }
    //非递归解法
    public ListNode swapPairs1(ListNode head) {
        ListNode curr = new ListNode(0,head);
        ListNode temp = curr;
        while (temp.next!=null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return curr.next;
    }
}
