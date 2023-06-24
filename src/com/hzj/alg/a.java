package com.hzj.alg;

import javax.script.ScriptEngineManager;
import java.util.Stack;

public class a {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2","1","+","3","*"};
        int num = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            if (!(tokens[i].equals("+") || tokens[i].equals("-") ||
                    tokens[i].equals("*") || tokens[i].equals("/"))) {
                stack.push(Integer.parseInt(tokens[i]));
            }else {
                String a = tokens[i];
                int b = stack.pop();
                int c = stack.pop();
                switch (a) {
                    case "+" : stack.push(b + c);break;
                    case "*": stack.push(c * b); break;
                    case "-" : stack.push(c - b); break;
                    case "/" : stack.push(c / b); break;
                    default:
                }
            }
    }
        System.out.println(stack.pop());
}
}
