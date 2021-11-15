package wildcard;

import java.util.ArrayList;

/**
 * @author li'zi'yao
 */
public class Wildcard {
    public static void main(String[] args) {
        ArrayList<Bwm> c = new ArrayList<>();
        c.add(new Bwm());
        c.add(new Bwm());
        c.add(new Bwm());
        go(c);

        ArrayList<Banz> z = new ArrayList<>();
        z.add(new Banz());
        z.add(new Banz());
        z.add(new Banz());
        go(z);
        ArrayList<Dog> d = new ArrayList<>();
        d.add(new Dog());
        d.add(new Dog());
        d.add(new Dog());
        // dog 类不继承 Car
//        go(d);


    }

    public static void go(ArrayList<? extends Car> c) {

    }
}


class Car {

}

class Dog {

}

class Bwm extends Car {

}

class Banz extends Car {

}