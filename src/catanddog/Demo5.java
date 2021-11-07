package catanddog;

/**
 * @author li'zi'yao
 */
public class Demo5 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("asdasd");
        c1.setAge(20);
        System.out.println(c1.getAge()+"\t"+c1.getName());
        c1.cached();

        Cat c2 = new Cat("zxczxc",123);
        System.out.println(c2.getAge()+"\t"+c2.getName());
        c2.cached();


        Dog d1 =new Dog();
        d1.setName("qwwer");
        d1.setAge(50);
        System.out.println(d1.getAge()+"\t"+d1.getName());
        d1.gatekeeper();

        Dog d2 = new Dog("fefqq",555);
        System.out.println(d2.getAge()+"\t"+d2.getName());
        d2.gatekeeper();

    }
}

