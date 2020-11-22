package com.zhaoyihui.al1221.split.string.in.balance.strings;

public class BalancedStringsSplit {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'L') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res++;
            }
        }

        return res;
    }
}
