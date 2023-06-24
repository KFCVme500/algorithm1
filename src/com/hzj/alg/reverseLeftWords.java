package com.hzj.alg;

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(chars[i]);
        }
        for (int i = n; i < s.length() ; i++) {
            stringBuffer1.append(chars[i]);
        }
        StringBuffer append = stringBuffer1.append(stringBuffer);
        String s1 = append.toString();
        return s1;

    }
}
