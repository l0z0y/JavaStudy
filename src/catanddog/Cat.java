package catanddog;

/**
 * @author li'zi'yao
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void cached() {
        System.out.println("抓老鼠");
    }


}
