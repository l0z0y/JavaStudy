package returnvalue2;

public class Demo2 {
    public static void main(String[] args) {
        AnimalOperate z = new AnimalOperate();
        Animal a= new Cat();
        z.useAnimal(a);

        Animal animal = z.getAnimal();
        animal.eat();


    }
}
