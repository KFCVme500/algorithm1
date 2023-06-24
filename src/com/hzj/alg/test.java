package com.hzj.alg;


public class test {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4))));
        ListNode re = new test().reverseBetween(listNode,2,3);
        System.out.println(re);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
            if (left == 1) {
                return reverseN(head,right);
            }
            head.next = reverseBetween(head.next,left - 1,right - 1);
            return head;
        }

       ListNode successor = null;
    public ListNode reverseN(ListNode head,int right) {
        if (right == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head,right - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

}
