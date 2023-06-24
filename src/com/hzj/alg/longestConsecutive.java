package com.hzj.alg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 128.最长连续序列
 */
public class longestConsecutive {
    public static void main(String[] args) {
        int[] a  = new int[] {9,1,4,7,3,-1,0,5,8,-1,6};
        int i = new longestConsecutive().longestConsecutive1(a);
        System.out.println(i);
    }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int a = 0;
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(hashSet.size());
        for (int num:hashSet
             ) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                a = Math.max(a,currentStreak);
            }

        }
        return a;
    }
    public int longestConsecutive1(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int size = hashSet.size();
        System.out.println(size);
        int a =0;
        for (Integer integer : hashSet) {
            if (!hashSet.contains(integer - 1)) {
                int cur =  integer;
                int pre = 1;
                while (hashSet.contains(cur + 1)) {
                cur += 1;
                pre += 1;
            }
            a = Math.max(a,pre);
            }
        }
        return a;
    }
}
