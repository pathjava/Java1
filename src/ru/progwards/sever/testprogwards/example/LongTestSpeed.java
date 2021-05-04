package ru.progwards.sever.testprogwards.example;

/**
 * @author Oleg Kiselev
 */
public class LongTestSpeed {

    public static void longClass(){
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Long Class: " + (stop - start));
    }

    public static void longPrimitive(){
        long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Long Primitive: " + (stop - start));
    }


    public static void main(String[] args) {
        longClass();
        longPrimitive();
    }

}
