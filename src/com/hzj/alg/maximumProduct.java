package com.hzj.alg;

import java.util.Arrays;

/**
 * 628.三个数最大的乘积
 */
public class maximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}
