package ru.progwards.sever.testprogwards.example.interfaces;

/**
 * @author Oleg Kiselev
 */
public class Cube implements Figure{
    @Override
    public int getAge(int age) {
        return 0;
    }

    @Override
    public void drawShape(Figure figure) {
        System.out.println(figure);
    }
}
