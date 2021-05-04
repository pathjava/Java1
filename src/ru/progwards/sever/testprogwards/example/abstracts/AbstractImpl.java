package ru.progwards.sever.testprogwards.example.abstracts;

/**
 * @author Oleg Kiselev
 */
public class AbstractImpl extends AbstractModel{
    @Override
    public void printAbstractText(String text) {
        System.out.println(text);
    }

    @Override
    public int getAge(int age) {
        return age;
    }

    @Override
    public void printAge(int age) {
        System.out.println(age);
    }
}
