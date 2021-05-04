package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class IteratorRemoveElem {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 4, 8, 3, 14, 18, 37, 25);
//        List<Integer> list = new ArrayList<>(List.of(1, 5, 4, 8, 3, 14, 18, 37, 25));

        list.forEach(System.out::print);

        Integer temp = 8;

        List<Integer> listTwo = new ArrayList<>();

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integer.equals(temp))
                iterator.remove();
            else
                listTwo.add(integer);
        }

        System.out.println();

        listTwo.forEach(System.out::print);
    }

}
