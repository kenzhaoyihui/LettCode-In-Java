package com.zhaoyihui.al0557.reserve.string3;

import java.util.ArrayList;
import java.util.List;

public class Reservestring3 {

    public static void main(String[] args) {
        String ss = "Let's take LeetCode contest";
        System.out.println(reverseWords(ss));
    }

    public static String reverseWords(String s) {
        String[] ss = s.split("\\s");
        List<String> words = new ArrayList<>();

        for (String a : ss) {
            words.add(reverseString(a));
        }

        return String.join(" ", words);
    }


    public static String reverseString(String s) {

        List<String> list = new ArrayList<>();

        for (int i=s.length()-1; i>=0; i--) {
            list.add(String.valueOf(s.charAt(i)));
        }

        return String.join("", list);
    }
}
