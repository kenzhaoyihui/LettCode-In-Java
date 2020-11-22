package com.zhaoyihui.al0344.reserve.string;

public class ReverseString {

    public static void main(String[] args) {
        char[] ss = new char[]{'h','e','l','l','o'};
        System.out.println(reverseString(ss));
    }

    public static char[] reverseString(char[] s) {

        for (int i=0; i<s.length/2;i++){
            char tmp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }
        return s;
    }
}
