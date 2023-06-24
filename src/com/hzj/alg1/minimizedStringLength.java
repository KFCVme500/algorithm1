package com.hzj.alg1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 最小化字符串长度
 */
public class minimizedStringLength {
    public static void main(String[] args) {
        int i = new minimizedStringLength().minimizedStringLength("aaabc");
        System.out.println(i);
    }
    public int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();
        Set set = new HashSet();
        for (char aChar : chars) {
            set.add(aChar);
        }
        return set.size();
    }
}
