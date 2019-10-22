package by.belhard.j18.lesson_class.lesson4;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country("Brazil", 123456);
        System.out.println(country1.title + "zipCode" +country1.zipCode);
        Person person1= new Person(("Alfredo", country1));
        Person person2 = new Person(("Tereza",16, person1.country,Sex.FEMALE))

    }
}
