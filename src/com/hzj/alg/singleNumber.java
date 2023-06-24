package com.hzj.alg;

import java.util.HashMap;
import java.util.Map;

/**
 * 136.只出现一次的数字
 */
public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int i = new singleNumber().singleNumber1(nums);
        System.out.println(i);
    }

    /**
     * 利用hash表，key不可重复
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            System.out.println("* " + count);
            count = count == null ? 1 : ++count;
            System.out.println(count);
            map.put(i,count);
        }
        System.out.println(map);
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }
    public int singleNumber2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i,count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 异或
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        int ans = nums[0];
        for (int i = 1;i < nums.length;i++) {
            ans = ans^nums[i];
        }
        return ans;
    }
}
