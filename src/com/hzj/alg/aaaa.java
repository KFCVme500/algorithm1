package com.hzj.alg;

public class aaaa {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,6,1,0};
        int[] a1 = new aaaa().a(a);
        for (int i : a1) {
            System.out.println(i);
        }
    }
    public int[] a(int[] num) {
        if (num.length == 0) return num;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        return num;
    }
}
