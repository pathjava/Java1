package ru.progwards.sever.testprogwards.example.abstracts;

/**
 * @author Oleg Kiselev
 */
public abstract class AbstractModel implements InterfaceModel {

    public void printSomeText(){
        System.out.println("some text");
    }

    public abstract void printAbstractText(String text);

}
