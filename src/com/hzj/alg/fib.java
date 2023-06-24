package com.hzj.alg;

public class fib {
    public static void main(String[] args) {
        int fib = new fib().fib(5);
        System.out.println(fib);
    }
    public int fib(int n) {
        final int MOD = 1000000007;
        if (n < 2) {
            return n;
        }

        int a = 0,b = 0,c = 1;
        for (int i = 2; i <= n; ++i) {
            a = b;
            b = c;
            c = (a + b) % MOD;
        }
        return n;
    }
}
