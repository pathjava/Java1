package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class GenericsExample {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(11);
        List<? extends Number> nums = ints;
        nums.forEach(System.out::println);

        List<Number> numsTwo = new ArrayList<>();
        numsTwo.add(15);
        List<? super Integer> intsTwo = numsTwo;
        intsTwo.forEach(System.out::println);
    }

}
