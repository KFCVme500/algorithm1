package com.hzj.alg;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        new rotate().rotate(a,2);
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
            System.out.println((i + k) % n);
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
