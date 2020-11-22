package com.zhaoyihui.al1614.maximum.nesting.depth.of.the.parenteses;

public class AL1614 {
    public static void main(String[] args) {
        String s1 = "(1+(2*3)+((8)/4))+1";
        String s2= "(1)+((2))+(((3)))";
        String s3 = "1+(2*3)/(2-1)";
        String s4 = "1";

        System.out.println(maxDepth(s1));
        System.out.println(maxDepth(s2));
        System.out.println(maxDepth(s3));
        System.out.println(maxDepth(s4));

    }

    // 从左往右数(和），(加1，)减1， 记录max 值
    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                count += 1;
            } else if (s.charAt(i) == ')') {
                max = max > count ? max: count;
                count -= 1;
            } else {
                continue;
            }
        }

        return max;
    }
}
