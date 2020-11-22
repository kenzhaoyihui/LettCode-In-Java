package com.zhaoyihui.al0657.robot.origin;

import sun.jvm.hotspot.memory.PlaceholderEntry;

public class JudgeCircle {

    public static void main(String[] args) {

    }

    public static boolean judgeCircle(String moves) {
        int count1 = 0; // UD
        int count2 = 0; // LR

        for (int i=0; i< moves.length();i++) {
            if (moves.charAt(i) == 'U') {
                count1++;
            } else if (moves.charAt(i) == 'D') {
                count1--;
            } else if (moves.charAt(i) == 'L') {
                count2++;
            } else if (moves.charAt(i) == 'R'){
                count2--;
            }
        }

        if (count1 == 0 && count2 == 0) {
            return true;
        }

        return false;
    }
}
