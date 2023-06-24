package com.hzj.alg1;

/**
 * 青蛙跳台阶问题
 * 动态规划
 * 每跳上一层台阶，都可以以它为起点
 */
public class numWays {
    public static void main(String[] args) {
        int i = new numWays().numWays(4);
        System.out.println(i);
    }
        public int numWays(int n) {
            int a = 1, b = 1, sum;
            for(int i = 0; i < n; i++){
                sum = (a + b) % 1000000007;
                a = b;
                b = sum;
            }
            return a;

    }
}
