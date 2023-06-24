package com.hzj.alg;

public class generateMatrix {
    public static void main(String[] args) {
        new generateMatrix().generateMatrix(3);
    }
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int b = n * n;
        int d = 1;
        int left = 0,right = n - 1,top = 0,c = n - 1;
        while (left <= right || top <= c) {
            for (int i = left; i <= right; i++) {
                a[left][i] = d;
                d++;
            }
            for (int i = top + 1; i <= c ; i++) {
                a[i][right] = d;
                d++;
            }
            if (left <= right || top <= c) {
                for (int i = right - 1; i >= left; i--) {
                    a[c][i] = d;
                    d++;
                }
                for (int i = c - 1; i > top ; i--) {
                    a[i][left] = d;
                    d++;
                }
            }
            left ++;
            right--;
            top++;
            c--;
        }
        return a;
    }
}
