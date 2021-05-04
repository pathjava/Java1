package ru.progwards.sever.testprogwards.example.serialization;

/**
 * @author Oleg Kiselev
 */
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        SerializationExample se = new SerializationExample();
        System.out.println(se.serializationOut(cat));

        System.out.println(se.serializationIn());

    }

}
