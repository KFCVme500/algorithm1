package com.hzj.alg;

import java.util.LongSummaryStatistics;

public class longestPalindrome {
    public static void main(String[] args) {
       longestPalindrome l = new longestPalindrome();
        String cabac = l.ad("lp");
        System.out.println(cabac);
    }
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxlen = 1;
        int begin = 0;
        Boolean[][] dp = new Boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i]  = true;
        }
        char[] charArray = s.toCharArray();

        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = L + i -1;
                if (j >= len) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                }else if (j - i < 3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j] && j - i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    begin = i;
                }
            }

        }

        return s.substring(begin,begin + maxlen);
    }
    public String ad(String s) {
        int len = s.length();
        System.out.println(len);
        if (len < 2) {
            return s;
        }
        int maxlen = 1;
        int begin = 0;
        Boolean[][] b = new Boolean[len][len];
        for (int i = 0; i < len; i++) {
            b[i][i] = true;
        }
        char[] c = s.toCharArray();

        for (int i = 2; i <= len; i++) {
            for (int j = 0; j < len; j++) {
                int k = i + j - 1;
                if (k >= len) {
                    break;
                }
                if (c[j] != c[k]){
                    b[j][k] = false;
                }else if (k - j < 3) {
                   b  [j][k] = true;
                } else {
                    b[j][k] = b[j + 1][k - 1];
                }
                if (b[j][k] && k - j + 1 > maxlen) {
                    maxlen = k - j + 1;
                    begin = j;
                }
            }
        }
        return s.substring(begin,begin +maxlen);
    }
}




