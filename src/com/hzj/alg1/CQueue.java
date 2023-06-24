package com.hzj.alg1;

import java.util.Stack;

public class CQueue {
    public static void main(String[] args) {
        CQueue obj = new CQueue();
 obj.appendTail(2);
  int param_2 = obj.deleteHead();
        System.out.println(param_2);
    }
    Stack<Integer> stack;
    Stack<Integer> stack1;
    public CQueue() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack == null) {
            if (stack1 == null) {
                return -1;
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            stack1.push(stack.pop());
        }
        return stack1.pop();
    }
}
