package com.hzj.alg;

public class replaceSpace {
    public static void main(String[] args) {
        String a = new String("we are.");
        String s = new replaceSpace().replaceSpace(a);
        System.out.println(s);
    }
    public String replaceSpace(String s) {
       // s.replace(" ","%20");
        String s1 = s.replaceAll(" ", "%20");
        return s1       ;
        }

}
