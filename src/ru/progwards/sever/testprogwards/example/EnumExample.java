package ru.progwards.sever.testprogwards.example;

/**
 * @author Oleg Kiselev
 */
public class EnumExample {

    public enum Role {
        USER,
        ADMIN
    }


    public static void main(String[] args) {
        System.out.println(Role.ADMIN.name());
        System.out.println(Role.USER.name());
    }

}
