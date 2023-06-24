package com.hzj.alg;


public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 class Solution {
     public static void main(String[] args) {
         ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(6)));
         ListNode listNode1 = Solution.reverseList(listNode);
         System.out.println(listNode1);
     }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}

