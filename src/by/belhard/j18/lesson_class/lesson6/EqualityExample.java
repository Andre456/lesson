package by.belhard.j18.lesson_class.lesson6;

public class EqualityExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 20,100);
        Person person2 = new Person("Ivan", 20,70);

        System.out.println(person1==person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person1));

    }


}
