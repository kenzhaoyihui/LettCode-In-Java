package com.zhaoyihui.al01.twosum;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {

        int[] testNums = new int[]{2,7,11,15};
        System.out.println(twoSum(testNums, 9));
    }

    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == target-nums[i]) {
                    return new int[] {entry.getKey(), i};
                }
            }
            map.put(i, nums[i]);
        }
        return null;

    }
}
