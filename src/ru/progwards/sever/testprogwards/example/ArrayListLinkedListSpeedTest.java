package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Oleg Kiselev
 */
public class ArrayListLinkedListSpeedTest {

    public static final int MAX_SIZE = 1000000;

    public static long arrayListSpeedTest(){

        long start = System.currentTimeMillis();
        ArrayList<Integer> list = IntStream.range(0, MAX_SIZE).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        HashMap<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(integer -> integer, integer -> integer, (a, b) -> b, HashMap::new));
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static long linkedListSpeedTest(){

        long start = System.currentTimeMillis();
        LinkedList<Integer> list = IntStream.range(0, MAX_SIZE).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        HashMap<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(integer -> integer, integer -> integer, (a, b) -> b, HashMap::new));
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList: " + arrayListSpeedTest());
        System.out.println("LinkedList: " + linkedListSpeedTest());
    }

}
