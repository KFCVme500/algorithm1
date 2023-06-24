package com.hzj.alg;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 453.最小操作次数使数组相等。
 * 输入：nums = [1,2,3]
 * 输出：3
 * 解释：
 * 只需要3次操作（注意每次操作会增加两个元素的值）：
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-moves-to-equal-array-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 逆向思维，n-1个数加1等于1个数减1；
 */
public class minMoves {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3};
        int i = new minMoves().minMoves(a);
        System.out.println(i);
    }
    public int minMoves(int[] nums) {
        OptionalInt max = Arrays.stream(nums).min();
        int asInt = max.getAsInt();
        int a = 0;
        for (int b :nums
                ) {
            a += b - asInt;
        }
        return a;
    }
}
