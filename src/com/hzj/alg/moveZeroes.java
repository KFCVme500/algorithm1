package com.hzj.alg;

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int a = nums.length;
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                size++;
                continue;
            }
            nums[i - size] = nums[i];
        }
        while (size > 0) {
            nums[a - size] = 0;
            size--;
        }
    }
}
