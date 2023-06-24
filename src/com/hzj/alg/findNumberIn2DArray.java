package com.hzj.alg;

public class findNumberIn2DArray {
    public static void main(String[] args) {

    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] a: matrix
             ) {
            for (int b: a
                 ) {
                if (target == b) {
                    return true;
                }
            }
        }
        return false;
    }
}
