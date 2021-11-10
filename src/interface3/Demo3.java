package interface3;

/**
 * @author li'zi'yao
 */
public class Demo3 {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("asdasd");
        c.setAge(123);
        System.out.println(c.getName() + "\t" + c.getAge());

        c.eat();
        System.out.println();


        //报错  对象c是Animal类型 Animal类型没有jump接口
//        c.jump();

        Jump j = new Cat();
        j.jump();
        System.out.println();

        Cat z = new Cat(123, "asdsad");
        System.out.println(z.getAge() + "\t" + z.getName());
        z.eat();
        z.jump();


    }
}
