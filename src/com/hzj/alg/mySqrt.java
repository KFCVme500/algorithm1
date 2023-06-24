package com.hzj.alg;

/**
 * 69.x的平方根
 * Math.exp(x) = e^x
 * Math.log(x) = ln^x
 */
public class mySqrt {
    public static void main(String[] args) {
        int i = new mySqrt().mySqrt(8);
        System.out.println(i);
    }
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long)(ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
