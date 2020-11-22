package com.zhaoyihui.al709.lower.cases;

import com.sun.xml.internal.xsom.impl.scd.Step;

public class ToLowerCase {

    public static void main(String[] args) {
        String ss = "LonwwW";
        System.out.println(toLowerCase(ss));
        System.out.println(toLowerCase2(ss));
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }


    public static String toLowerCase2(String str) {

        StringBuilder sb =  new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            char tmp = str.charAt(i);
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                tmp = (char) (tmp + 32);
            }
            sb.append(String.valueOf(tmp));
        }

        return sb.toString();
    }
}
