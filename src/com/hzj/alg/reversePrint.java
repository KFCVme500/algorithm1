package com.hzj.alg;

import java.util.Stack;

public class reversePrint {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2));
        int[] ints = new reversePrint().reversePrint(listNode);
        for (int a:ints
             ) {
            System.out.println(a);
        }
    }
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
}
