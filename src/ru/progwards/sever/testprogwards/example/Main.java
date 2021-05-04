package ru.progwards.sever.testprogwards.example;

/**
 * @author Oleg Kiselev
 */
public class Main {

    public static void printJava1(String[]args) {
        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+c+b);
        System.out.print(b+c+a);

    }
    public static void printJava(String java1, String java2) {
        System.out.println(java1);
        System.out.println(java2);
        System.out.println(java1 + ", " + java2 + "!");
        System.out.println(java2 + ", " + java1 + "!");
    }
    public static void main1(String[]args) {
        printJava("Чтобы Java понимать", "Надо функции писать");
    }

    public static String plusJava(String message) {
        return "Java - " + message + "язык программирования";
    }

    public static void main(String[]args) {
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
        String str;
        str = plusJava("самый популярный ");
        System.out.println(str);
        str = plusJava("объектно-ориентированный ");
        System.out.println(str);
        System.out.println(plusJava("очень интересный "));

    }

//    public static void ru.progwards.sever.testprogwards.example.main(String[] args){
//        System.out.print("Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...");
//    }

}
