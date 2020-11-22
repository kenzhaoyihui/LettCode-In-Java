package com.zhaoyihui.al1436.destination.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DestCity {

    public static void main(String[] args) {

        List<List<String>> paths = new ArrayList<>();

        List<String> path1 = Arrays.asList(new String[]{"B", "C"});

        List<String> path2 = Arrays.asList(new String[]{"D", "B"});
        List<String> path3 = Arrays.asList(new String[]{"C", "A"});

        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        System.out.println(destCity(paths));

    }

    public static String destCity(List<List<String>> paths) {

        // 取end 中不在start 里面的就是终点 城市
        List<String> end = paths.stream().map(e->e.get(1)).collect(Collectors.toList());

        List<String> start = paths.stream().map(e->e.get(0)).collect(Collectors.toList());

        for (String s: end) {
            if (!start.contains(s)) {
                return s;
            }
        }

        return null;
    }
}
