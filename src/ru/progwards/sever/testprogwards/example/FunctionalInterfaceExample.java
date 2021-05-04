package ru.progwards.sever.testprogwards.example;

/**
 * @author Oleg Kiselev
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Printer printer = System.out::println;
        printer.print("Hello!");
    }

}
@FunctionalInterface
interface Printer{
    void print(String str);
}
