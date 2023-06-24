package com.hzj.alg;

/**
 * 2.两数相加
 */
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4)));
        new addTwoNumbers().addTwoNumbers1(a,b);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
             carry = sum / 10;
             sum = sum % 10;

             cur.next = new ListNode(sum);
             cur = cur.next;
             if (l1 != null) {
                 l1 = l1.next;
             }
             if (l2 != null) {
                 l2 = l2.next;
             }
             if (carry == 1) {
                 cur.next = new ListNode(carry);
             }
        }
        return pre.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int a = 0;
        while (l1 != null || l2 != null) {

            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int num = x + y + a;

            a = num / 10;
            num = num % 10;

            cur.next  = new ListNode(num);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;

            }
            if (l2 != null) {
                l2 = l2.next;
            }

            if (a == 1) {
                cur.next = new ListNode(a);
            }

        }
        return pre.next;
    }
}
