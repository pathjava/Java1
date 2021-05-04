package ru.progwards.sever.testprogwards.example.abstracts;

import static java.lang.String.format;

/**
 * @author Oleg Kiselev
 */
public class Main {

    public static void main(String[] args) {

        InterfaceModel model = new AbstractImpl();

        System.out.println(format("result %s", 1) + model.getAge(15));
        model.printAge(25);

        AbstractModel abstractModel = new AbstractImpl();

        abstractModel.printAbstractText("print abstract text");
        abstractModel.printSomeText();

    }

}
