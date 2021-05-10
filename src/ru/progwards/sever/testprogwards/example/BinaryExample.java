package ru.progwards.sever.testprogwards.example;

import java.util.List;

/**
 * @author Oleg Kiselev
 */
public class BinaryExample {

    public static final int DEFAULT_ADMIN = 0b00001;
    public static final int DEFAULT_PARTICIPANT = 0b00010;
    public static final int DEFAULT_GUEST = 0b00100;
    public static final int DEFAULT_BOT = 0b01000;
    public static final int IS_EXECUTOR = 0b10000;

    private BinaryExample() {
    }

    /**
     * @return Список флагов для активных участников активности.
     */
    public static List<Integer> getActiveParticipantsFlags() {
        return List.of(
                DEFAULT_ADMIN | IS_EXECUTOR,
                DEFAULT_PARTICIPANT | IS_EXECUTOR);
    }

    /**
     * @return Флаги для участника активности, выполняющего в ней действия.
     */
    public static int getParticipantExecutorFlags() {
        return DEFAULT_PARTICIPANT | IS_EXECUTOR;
    }

    /**
     * @return Флаги для создателя активности, выполняющего в ней действия.
     */
    public static int getAdminExecutorFlags() {
        return DEFAULT_ADMIN | IS_EXECUTOR;
    }

    public static int getAdminFlags() {
        return DEFAULT_ADMIN;
    }

    public static void main(String[] args) {
//        System.out.println(getAdminFlags());
//
//        System.out.println();
//
        System.out.println(getAdminExecutorFlags());
//
//        System.out.println();
//
//        System.out.println(getParticipantExecutorFlags());
//
//        System.out.println();
//
//        getActiveParticipantsFlags().forEach(System.out::println);

        System.out.println("111111111111111111");

        System.out.println("Test Kraken");

        System.out.println("!!!!!!!!!!!!!!!!!!");

        System.out.println("Test brunch 4");

        System.out.println("Test brunch 5");

        System.out.println("Test brunch 6");

        System.out.println("Test brunch 7");

        System.out.println("Test brunch 8");

        System.out.println("Test brunch 9");

        System.out.println("Test brunch 10");

        System.out.println("Test brunch 11");

        System.out.println("Test brunch 14");
        System.out.println("Test brunch 14-3");

    }

}
