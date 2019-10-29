package by.belhard.j18.lesson_class.homework.home_work3;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Table table1 = new Table(MaterialType.GLASS, TableShape.OVAL, 4,100);


        System.out.println(table1.legs+" "+ table1.price);

    }
    }

