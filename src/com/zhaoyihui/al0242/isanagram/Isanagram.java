package com.zhaoyihui.al0242.isanagram;

import java.util.*;

public class Isanagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarmm";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<String> lists = Arrays.asList(s.split(""));
        List<String> listt = Arrays.asList(t.split(""));

        Collections.sort(lists);
        Collections.sort(listt);

        if (Objects.equals(lists, listt)) {
            return true;
        }

        return false;

    }
}
