package by.belhard.j18.lesson_class.lesson6;

public class Inhertance {
    public static void main(String[] args) {
        Person person1 = new Person("Vasilily", 35,74.1);
    person1.eat("fish");
        System.out.println(person1.growOld());

        Worker worker1 =new Worker("Ivan", 27, 63.9,500);
        worker1.work();
        worker1.eat("Meet");
        System.out.println(worker1.growOld());
        System.out.println();
        Person work2 = new Worker("Ivan", 27, 63.9,500);
work2.eat("potato");
        System.out.println(work2.growOld());
        ((Worker)work2).work();
    }

}
