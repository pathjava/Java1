package ru.progwards.sever.testprogwards.example;

/**
 * @author Oleg Kiselev
 */
public class Square {

    public static int getSquare(int num) {
        if (num == 0 || num == 1)
            return num;

        int tempNum = 1;
        while (true) {
            int temp = (tempNum * tempNum);
            if (temp == num)
                return tempNum;
            else if (temp < num)
                tempNum++;
            else
                return --tempNum;
        }
    }


    public static void main(String[] args) {
        System.out.println(getSquare(10));
    }

}
