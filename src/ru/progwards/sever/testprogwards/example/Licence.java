package ru.progwards.sever.testprogwards.example;

import java.util.Random;
import java.util.UUID;

/**
 * @author Oleg Kiselev
 */
class Licence implements Paper {
    public void showTest() {
        Paper.super.show();
        Paper.showStatic();
    }

    public static void main(String[] args) {
//        new Licence().showTest();
//
//
//        new Random()
//                .ints()
//                .limit(10)
//                .forEach(System.out::println);
//
//        System.out.println();

        System.out.println(UUID.randomUUID());

        new Random()
                .ints()
                .filter(i -> i  > 100)
                .filter(i -> i < 1000)
                .distinct()
                .limit(15)
                .sorted()
                .forEach(System.out::println);
    }
}

interface Paper {
    default void show() {
        System.out.println("default show()");
    }

    static void showStatic() {
        System.out.println("static show()");
    }
}