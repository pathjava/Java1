package ru.progwards.sever.testprogwards.example;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Oleg Kiselev
 */
public class ExampleTwo {

    private static char rndChar () {
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'a';
        return (char) (base + rnd % 26);
    }

    public static String randomChar(){
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            result.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return result.toString();
    }


    public static void main(String[] args) {
//        List<String> list = List.of("one", "two", "three");
//        Iterator<String> listIterator = list.listIterator();
//
//        List<String> listTwo = List.of("External one", "External two", "External three", "External four", "External five");
//        for (String s : listTwo) {
//            System.out.println(s);
//            if (!listIterator.hasNext()) {
//                listIterator = list.listIterator();
//            }
//            System.out.println(listIterator.next());
//        }
        System.out.println(randomChar());
//        System.out.println(rndChar());
    }

}
