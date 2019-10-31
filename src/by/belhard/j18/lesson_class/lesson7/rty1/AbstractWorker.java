package by.belhard.j18.lesson_class.lesson7.rty1;

public abstract class AbstractWorker {
    private  String name;
    private  int age;

    public AbstractWorker(String name, int age) {
        this.name = name;
        this.age = age;
    }
public void eat(String dish){
    System.out.printf("%s is eating %s\n", name, dish);

    }
    public abstract void work();
}
