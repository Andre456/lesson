package by.belhard.j18.lesson_class.lesson3;

import java.sql.SQLOutput;

public class Task3 {
    public static void main(String[] args) {
        int radius, rX = 0, rY;
        radius = 5;
        rY = 0;
        int pX = 3, pY = 4;
        int DX = rX - pX;
        int DY = rY - pY;
        double distance = DX * DX + DY * DY;
        int Rad = radius * radius;

        if (distance < Rad)
            System.out.println("inside");
    else if (distance == Rad) {
            System.out.println("on");
        }else  {
        System.out.println("out");

        }
    }
}
