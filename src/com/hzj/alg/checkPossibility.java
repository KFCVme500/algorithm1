package com.hzj.alg;

/**
 * 665.非递减数列
 * 输入: nums = [4,2,3]
 * 输出: true
 * 解释: 你可以通过把第一个 4 变成 1 来使得它成为一个非递减数列。
 */
public class checkPossibility {
    public static void main(String[] args) {
        int[] a = new int[]{4,2,3};
        boolean b = new checkPossibility().checkPossibility(a);
        System.out.println(b);
    }
    public boolean checkPossibility(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                c++;
                if (c > 1) {
                    return false;
                }
                if (i > 0 && nums[i + 1] < nums[i - 1]) {
                    nums[i + 1] = nums[i];
                }


            }
        }
        return true;
    }
}
