package com.hzj.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int[] a = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> duplicates = new findDuplicates().findDuplicates(a);
        System.out.println(duplicates);
    }
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int a ;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
