package com.hzj.alg;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class thirdMax {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int i = new thirdMax().thirdMax(a);
        System.out.println(i);
    }
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int num : nums) {
            s.add(num);
            if (s.size() > 3) {
                s.remove(s.first());
            }
        }
        return s.size()==3 ? s.first(): s.last();
    }
}
