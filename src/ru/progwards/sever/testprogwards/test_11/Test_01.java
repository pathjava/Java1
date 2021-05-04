package ru.progwards.sever.testprogwards.test_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test_01 {
    public static List<Integer> listAction(List<Integer> list) {
        list.remove(Collections.min(list));
        list.add(0, list.size());
        list.add(2, Collections.max(list));
        return list;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        System.out.println(list);

        System.out.println(listAction(list));
    }
}
