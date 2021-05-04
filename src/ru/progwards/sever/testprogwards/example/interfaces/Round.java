package ru.progwards.sever.testprogwards.example.interfaces;

/**
 * @author Oleg Kiselev
 */
public class Round implements Figure, Environment {
    @Override
    public int getAge(int age) {
        return age;
    }

    @Override
    public void drawShape(Figure figure) {
        System.out.println(figure);
    }
}
