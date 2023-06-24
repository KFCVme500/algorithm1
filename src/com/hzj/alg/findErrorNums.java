package com.hzj.alg;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class findErrorNums {
    public static void main(String[] args) {
        int[] a = new int[]{2,2};
        int[] errorNums = new findErrorNums().findErrorNums(a);
        for (int i = 0; i < errorNums.length; i++) {
            System.out.println(errorNums[i]);
        }
    }
    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr == prev) {
                errorNums[0] = prev;
            } else if (curr - prev > 1) {
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n - 1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }
    }

