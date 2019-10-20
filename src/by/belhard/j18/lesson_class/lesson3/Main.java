package by.belhard.j18.lesson_class.lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int r = 5;
        double pi = 3.14;
        if (r<=0) {
            System.out.println("Error");
        }else{
            System.out.println("leng " + r * pi * 2 );
            System.out.println("squre: " +r * r * Math.PI);
        }
    }
}
