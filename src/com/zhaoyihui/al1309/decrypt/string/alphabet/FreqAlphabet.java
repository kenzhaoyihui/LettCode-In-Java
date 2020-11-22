package com.zhaoyihui.al1309.decrypt.string.alphabet;

import java.util.HashMap;
import java.util.Map;

public class FreqAlphabet {

    public static void main(String[] args) {
        String ss = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(ss));
    }

    public static String freqAlphabets(String s) {
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            if (i < 9) {
                map.put(String.valueOf(i + 1), (char) ('a' + i));
            } else {
                map.put(String.valueOf(i + 1) + "#", (char) ('a' + i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() -2; i++) {
            if (s.charAt(i + 2) != '#') {
                sb.append(map.get(String.valueOf(s.charAt(i))));
            } else {
                sb.append(map.get(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)) + String.valueOf(s.charAt(i + 2))));
                i=i+2;
            }
        }

        int lastIndex = s.lastIndexOf("#");
        if (lastIndex<s.length()) {
            for (int i=lastIndex+1;i<s.length();i++) {
                sb.append(map.get(String.valueOf(s.charAt(i))));
            }
        }

        return sb.toString();
    }
}
