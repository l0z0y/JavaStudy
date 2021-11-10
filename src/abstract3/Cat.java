package abstract3;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cdx");
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }
}
