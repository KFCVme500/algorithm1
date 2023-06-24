package com.hzj.alg;

public class ListNodeTest {
    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode listNode = new ListNodeTest().test3(head,2,3);
        System.out.println(listNode);
    }

    /**
     * 反转整个链表
     * @param head
     * @return
     */
    public ListNode test1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = test1(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    /**
     * 反转链表的前n个结点
     * @param head
     * @param n
     */
    ListNode successor = null;
    public ListNode test2(ListNode head,int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode listNode = test2(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return listNode;
    }

    /**
     * 反转链表的一部分
     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode test3(ListNode head,int m,int n) {
        if (m == 1) {
            return test2(head,n);
        }
        head.next = test3(head.next, m - 1, n - 1);
        return head;
    }

    /**
     * 反转k个一组链表
     * @param head
     * @param k
     * @return
     */
    public ListNode test4(ListNode head,int k) {
        if (head == null) return head;
        ListNode a,b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) return head;
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next = test4(b,k);
        return newHead;
    }
    public ListNode reverse(ListNode a,ListNode b) {
        ListNode pre,cur,nxt;
        pre = null; cur = a;nxt = a;
        while (cur != b) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
