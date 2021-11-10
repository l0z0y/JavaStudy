package abstract1;

/**
 * @author li'zi'yao
 */
public class Demo1 {
    public static void main(String[] args) {
    //抽象类无法新建对象
//        Animal a =new Animal();
        Animal a = new Cat();

        a.eat();
        a.sleep();




    }

}
