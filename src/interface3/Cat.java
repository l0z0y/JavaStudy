package interface3;

/**
 * @author li'zi'yao
 */
public class Cat extends Animal implements Jump  {

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("chiyu");

    }

    @Override
    public void jump() {
        System.out.println("tiaogg");
    }
}
