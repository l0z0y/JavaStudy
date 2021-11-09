package polymorphism3;

/**
 * @author li'zi'yao
 */
public class Demo3
{
    public static void main(String[] args) {
        //向上转型 从子到父
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat c = (Cat)a ;
        c.eat();
        c.play();

        Dog dd = new Dog();
        dd.eat();

    }
}
