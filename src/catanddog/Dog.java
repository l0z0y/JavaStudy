package catanddog;

/**
 * @author li'zi'yao
 */
public class Dog extends Animal{

    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public  void  gatekeeper(){
        System.out.println("看门");
    }
}
