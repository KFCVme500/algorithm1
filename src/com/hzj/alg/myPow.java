package com.hzj.alg;

/**
 *50.实现pow(x,n),即计算x的整数n次方幂函数
 */
public class myPow {
    public static void main(String[] args) {
        double v = new myPow().myPow(2, 3);
        System.out.println(v);
    }
    public double myPow(double x,int n) {
        long N = n;
        return N > 0 ? quickMul(x,N) : 1.0/quickMul(x,-N);
    }
    public double quickMul(double x,long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N/2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
    public double quickMul1(double x,long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul1(x, N/2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
