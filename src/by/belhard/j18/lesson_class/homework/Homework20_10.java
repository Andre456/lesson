package by.belhard.j18.lesson_class.homework;

import java.sql.SQLOutput;


public class Homework20_10 {
    public static void main(String[] args) {
        //задание 1
        int a = 50;
        if (a < 10) {
            System.out.println("Надень куртку");
        } else if ( a <15) {
            System.out.println("Надень ветровку");
        } else if ( a < 20) {
            System.out.println("Надень свитер");
        } else if (a < 30) {
            System.out.println("Надень майку");
        } else {
            System.out.println("Жара");
        }
// задание 2
        int zp1 = 45, zp2 = 10, zp3 = 50, max = 0, min = 0, delta;
        min = (zp1 < zp2) ? ((zp1 < zp3) ? zp1 : zp3) : ((zp2 < zp3) ? zp2 : zp3);
        System.out.println("min " + min);
        max = (zp1 > zp2) ? ((zp1 < zp3) ? zp3 : zp1) : ((zp2 < zp3) ? zp3 : zp2);


        System.out.println("max " + max);
        System.out.println("delta " + (max - min));


        // задание 3
//
        int an = 2, n =6, result = an;
        for (int B = 0; B < n-1;B++) {
            result *= an;
        }
        System.out.println(result);


        // задание 4


        int years = 10, starSum = 300;
        double money, proc = 0.1;

        money = (starSum * Math.pow((1 + proc), years));

        System.out.println("money" + money);


// задание 5


        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 7 == 0))
                System.out.print(i + " ");

        }
        System.out.println("\n");
        for (int f = 1; f <= 100; f++) {
            if ((f % 5 == 0) ^ (f % 7 == 0))

                System.out.print(f + " ");
        }

//        System.out.println("\n");
//        for (int g = 1; g <= 100; g++) { //проверка на четность
//            if(g/10%2==1)
//            if ((g % 5 == 0) ^ (g % 7 == 0))
//
//                System.out.print(g + " ");
//        }

        System.out.println("\n");
        int[] array = {5, 1, 6, 7, 6, 5, 7, 1, 2, 3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = (sum + array[i]);
        }
        System.out.println("sum" + sum);


//упр7
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
}






