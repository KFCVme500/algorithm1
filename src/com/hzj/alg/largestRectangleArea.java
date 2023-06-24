package com.hzj.alg;

import java.util.Stack;

/**
 * 84.柱状图中最大的矩形
 */
public class largestRectangleArea {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,5,6,2,3};
        int i = new largestRectangleArea().largestRectangleArea(a);
    }
    public int largestRectangleArea(int[] heights) {
        int[] newHeight = new int[heights.length + 2];
        System.arraycopy(heights,0,newHeight,1,heights.length);
        newHeight[heights.length + 1] = 0;
        newHeight[0] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int res = 0;
        for (int i = 0; i < newHeight.length; i++) {
            //计算面积条件 数组右边的数小于当前数
            while (newHeight[i] < newHeight[stack.peek()]) {
                int mid = stack.pop();
                int w = i - stack.peek() - 1;
                int h = newHeight[mid];
                res = Math.max(res,w * h);
            }
            stack.push(i);
        }
        return res;
    }
}
