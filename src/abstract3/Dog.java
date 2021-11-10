package abstract3;

public class Dog extends Animal {


    @Override
    public void eat() {

        System.out.println("cgt");

    }

    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
    }
}
