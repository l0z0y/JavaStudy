package polymorphism;

/**
 * @author li'zi'yao
 */
public class Demo1 {
    public static void main(String[] args) {

        //由父类引用指向子类
        Animal a = new Cat();
        a.eat();
        //父类没有该方法无法调用
//        a.play();
        a.playz();
        System.out.println("");

        System.out.println(a.age);
        // 父类没有 height 成员变量 无法访问
//        System.out.println(a.height);


    }
}
