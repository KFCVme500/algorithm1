package com.hzj.alg;


import java.util.Arrays;

/**
 * 16.最接近的三数之和
 * 采用排序和双指针
 */
public  class threeSumClosest {
    public static void main(String[] args) {
        int[] a = {0,1,2};

        int i = new threeSumClosest().test(a, 3);
        System.out.println(i);
    }
    public  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1,end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (Math.abs(target -sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum > target) end--;
                else if (sum < target) start++;
                else return ans;
            }
        }
        return ans;
    }
    public int test(int[] nums, int target) {
        Arrays.sort(nums);
        int a ,nus;


        a = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int begin = i + 1, last = nums.length - 1;
            while (begin < last) {
                nus = nums[i] + nums[begin] + nums[last];
                if (Math.abs(target - a) > Math.abs(target - nus)) a = nus;
                if (nus < target) begin++;
                else if (nus > target) last--;
                else return nus;

            }
        }
        return a;
    }
}
