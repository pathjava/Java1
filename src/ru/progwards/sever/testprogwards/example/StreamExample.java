package ru.progwards.sever.testprogwards.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Oleg Kiselev
 */
public class StreamExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 4, 8, 5, 3, 14, 4, 18, 37, 25, 1, 8, 14, 5, 5);

//        boolean b = list.stream()
//                .anyMatch(i -> i.equals(8));
//        System.out.println(b);
//
//        list.stream()
//                .sorted()
//                .forEach(i -> System.out.print(i + " "));
//
//        System.out.println();
//
//        Integer integer = list.stream()
//                .max(Integer::compare)
//                .orElse(0);
//        System.out.println(integer);
//
//        list.stream()
//                .map(i -> i * i)
//                .distinct()
//                .forEach(i -> System.out.print(i + " "));

//        System.out.println(list.stream()
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList()));

//        list.stream()
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        List<Integer> newList = list.stream()
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(newList);
    }

}
