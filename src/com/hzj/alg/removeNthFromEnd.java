package com.hzj.alg;

public class removeNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4))));
        ListNode listNode1 = new removeNthFromEnd().removeNthFromEnd2(listNode, 3);
        System.out.println(listNode1.toString());
    }
    static class  ListNode {
    int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }// TODO: 2023/2/2

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
  public ListNode removeNthFromEnd(ListNode head,int n) {

        ListNode dummy = new ListNode(0,head);
        int length = getLength(head);
        ListNode cur = dummy;
      for (int i = 1; i < length - n +1; i++) {
          cur = cur.next;
      }
      cur.next = cur.next.next;
      ListNode ans = dummy.next;
      return ans;
  }
  public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
  }
    public ListNode removeNthFromEnd1(ListNode head,int n) {
        //ListNode dummy = new ListNode(0,head);
        int length = getLength(head);
        System.out.println(length);
        ListNode cur = head;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
    public ListNode removeNthFromEnd2(ListNode head,int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode pre = dummy;
        int len = getLength(head);
        for (int i = 1; i < len - n + 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
