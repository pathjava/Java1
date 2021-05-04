package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class GenericNumber {

    public static void main(String[] args) {

        List<Number> list = new ArrayList<>(List.of(12, 17L, 20.0));

        Integer integer = 8;
        Long l = 10L;
        Double d = 15.0;

        list.add(integer);
        list.add(l);
        list.add(d);

        list.forEach(System.out::println);

    }

}
