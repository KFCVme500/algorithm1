package com.hzj.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] a = new int[]{4,3,2,7,8,2,3,1};//1,2,2,3,3,4,7,8
        List<Integer> disappearedNumbers = new findDisappearedNumbers().findDisappearedNumbers(a);
        System.out.println(disappearedNumbers);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> a = new ArrayList<>();
        int len = nums.length;
        int index = 0;
        while (index < len ) {
            if (nums[index] == index + 1) {
                index++;
            } else {
                int targetIndex = nums[index] - 1;
                if (nums[targetIndex] == nums[index]) {
                    index++;
                    continue;
                }
                int tmp = nums[targetIndex];
                nums[targetIndex] = nums[index];
                nums[index] = tmp;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i +1) {
                a.add(i + 1);
            }
        }
        return a;
    }
}
