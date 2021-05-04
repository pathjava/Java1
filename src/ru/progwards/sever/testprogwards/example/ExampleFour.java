package ru.progwards.sever.testprogwards.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class ExampleFour {

    private static void getName(String firstName){
        System.out.println(firstName);
    }

    private void getName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    private final Integer integer = 100;

    private final int integerOne = integer;

    private final Integer integerTwo = integerOne;

    private static final String name = "name";

    public static void main(String[] args) {
//        String costForPrint = "5$";
//        char one = costForPrint.charAt(0);
//        char two = costForPrint.charAt(1);
//        String three = String.valueOf(costForPrint.charAt(0));
//        System.out.println("Цена только для вас " +
//                + costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }

        System.out.println();

        System.out.println(ExampleFour.name);


//        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
//        System.out.println(list.get(2));
//        System.out.println(list.remove(2));
//        list.add(2, 8);
//        System.out.println(list.get(2));

//        int[] array = {1, 2, 3, 4, 5};
//        int[] arrayTwo = Arrays.copyOf(array, array.length);

//        System.out.format("|%12.5s|", "О бойся ты");
    }

    public static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

//    public static void main(String[] args) {
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("one");
//        stringList.add("one and a half");
//        stringList.add("two");
//        stringList.add("two and a half");
//        stringList.add("three and a half");
//
//        System.out.println("Before " + stringList);
//        Iterator<String> stringIterator = stringList.iterator();
//        while (stringIterator.hasNext()) {
//            String next = stringIterator.next();
//            if (next.equals("two and a half")) {
//                stringList.add("three");
//            }
//        }
//
//        System.out.println("After " + stringList);
//    }

}
