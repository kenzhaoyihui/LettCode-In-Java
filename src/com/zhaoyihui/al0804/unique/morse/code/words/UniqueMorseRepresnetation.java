package com.zhaoyihui.al0804.unique.morse.code.words;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseRepresnetation {

    public static void main(String[] args) {
//        System.out.println(String.valueOf((char) ('a' + 1)));

        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] ss = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> map = new HashMap<>();

        for (int i=0; i<ss.length;i++) {
            map.put((char)('a'+i), ss[i]);
        }

        Set<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<words[i].length();j++) {
                sb.append(map.get(words[i].charAt(j)));
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}
