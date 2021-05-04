package ru.progwards.sever.testprogwards.example;

import java.util.Arrays;
import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class StringBuilderExample {

    public static void main (String[] args) {
        System.out.println(join(Arrays.asList("a","bC7","d")));  //expected "A,BC7,D"
//        System.out.println(join(Arrays.asList("a",null,"a")));

    }

    // ["a","bC7","d"] -> "A,BC7,D"
    public static String join(List<String> list) {
        if(list == null || list.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        list.forEach(str -> sb.append(str).append(","));

//        for(String str : list){
//            if(str != null)
//                sb.append(str).append(",");
//        }
        return sb.substring(0, sb.length() -1).toUpperCase();
    }

}
