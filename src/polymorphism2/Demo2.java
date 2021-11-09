package polymorphism2;

public class Demo2 {
    public static void main(String[] args) {
        AnimalHandling ah = new AnimalHandling();
        Cat c = new Cat();
        ah.useAnimal(c);

        Dog z = new Dog();
        ah.useAnimal(z);


        Pig p = new Pig();
        ah.useAnimal(p);


    }
}
