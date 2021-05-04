package ru.progwards.sever.testprogwards.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Oleg Kiselev
 */
public class ReduceExample {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);

//        Optional<Integer> sum = numbers.stream()
//                .reduce(Integer::sum);
//
//        sum.ifPresent(System.out::println); //output 11

//        Integer sum = numbers.stream()
//                .reduce(10, Integer::sum);
//
//        System.out.println(sum); //output 11

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // 1*10 + 2*10 + 3*10
        Integer sum = numbers.stream()
                .reduce(10, (identity, val) -> identity * val, Integer::sum);

        System.out.println(sum); //output 60
    }

}
