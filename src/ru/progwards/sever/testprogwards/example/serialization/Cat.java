package ru.progwards.sever.testprogwards.example.serialization;

import java.io.Serializable;

/**
 * @author Oleg Kiselev
 */
public class Cat implements Serializable {

    private final static long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
