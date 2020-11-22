package com.zhaoyihui.al1374.generate.odd.counts.string;

public class GenerateTheString {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(generateTheString(n));
    }

    public static String generateTheString(int n) {

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<=n-2;i++) {
            sb.append("a");
        }
        if (n%2 == 0) {
            sb.append("b");
        } else  {
            sb.append("a");
        }

        return sb.toString();
    }
}
