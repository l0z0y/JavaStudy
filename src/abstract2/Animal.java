package abstract2;

/**
 * @author li'zi'yao
 */
public abstract class Animal {

    private final String city = "bijin";
    private int age = 20;

    public abstract  void eat();

    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public void show() {
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }





}
