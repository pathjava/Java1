package ru.progwards.sever.testprogwards.example;

import java.util.Scanner;
import java.util.function.*;

/**
 * @author Oleg Kiselev
 */
public class FunctionInterfaces {

    public static void main(String[] args) {

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(5));
        System.out.println(isZero.test(0));

        Consumer<String> printer = System.out::println;
        printer.accept("Hello!");

        Function<Integer, Double> converter = Double::valueOf;
        System.out.println(converter.apply(1));

//        Supplier<String> text = () -> {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter text: ");
//            return scanner.nextLine();
//        };
//        System.out.println(text.get());

        UnaryOperator<Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(7.5));

        BinaryOperator<Double> pow = Math::pow;
        System.out.println(pow.apply(2.5, 3.7));

        DoubleBinaryOperator powDouble = (x, y) -> x * y;
        System.out.println(powDouble.applyAsDouble(2.5, 6.2));

    }

}
