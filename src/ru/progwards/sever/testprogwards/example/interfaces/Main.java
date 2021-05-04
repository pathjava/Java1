package ru.progwards.sever.testprogwards.example.interfaces;

/**
 * @author Oleg Kiselev
 */
public class Main {

    public static void main(String[] args) {

        Figure figure = new Round();
        figure.drawShape(new Round());

        System.out.println(figure.getAge(10));


//        Round round = new Round();
//
//        System.out.println(round.getAge(10));

    }

}
