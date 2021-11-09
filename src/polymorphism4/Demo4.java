package polymorphism4;

/**
 * @author li'zi'yao
 */
public class Demo4 {
    public static void main(String[] args) {
        Animal am = new Cat();
        Animal ad = new Dog();
        am.setAge(15);
        am.setName("zzz");
        System.out.println(am.getAge()+"\t"+am.getName());

        Animal zz = new Cat("zxc",123  );
        System.out.println(zz.getAge()+"\t"+zz.getName());
        am.eat();

        ad.setAge(22);
        ad.setName("zxxcc");
        System.out.println(ad.getAge()+"\t"+ad.getName());

        Animal zc = new Dog("asddsa",1234);
        System.out.println(zc.getAge()+"\t"+zc.getName());
        ad.eat();

    }
}
