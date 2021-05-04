package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg Kiselev
 */


public class Example {


    public static double fractional(double num){
        double a = 1;
        return  num % a;
    }
    public static void main(String[] args){
//        System.out.println(fractional(1.53));
        System.out.println(fiboNumber(10));
    }

    public static int fiboNumber(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int n0 = 0;
        int n1 = 1;
        int fibo = 0;

        for (int i = 2; i <= n; i++) {
            fibo = n0 + n1;
            n0 = n1;
            n1 = fibo;
        }
        return fibo;
    }

//    public static void ru.progwards.sever.testprogwards.example.main(String[] args) {
//
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//    }

}
