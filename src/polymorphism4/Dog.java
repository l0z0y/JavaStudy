package polymorphism4;

/**
 * @author li'zi'yao
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


}
