package ru.progwards.sever.testprogwards.example.serialization;

import java.io.*;

/**
 * @author Oleg Kiselev
 */
public class SerializationExample {

    private final File file = new File("src/ru/progwards/sever/testprogwards/example/serialization/serialization.txt");

    public boolean serializationOut(Cat cat) {
        boolean mark = false;

        try (ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(file))) {
            ops.writeObject(cat);
            mark = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mark;
    }

    public boolean serializationIn() {
        boolean mark = false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Cat cat = (Cat) ois.readObject();
            System.out.println(cat);
            mark = true;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mark;
    }
}
