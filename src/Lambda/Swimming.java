package Lambda;

public class Swimming implements Swim {



    public void go(Swim s) {
        System.out.println("ccc");
        s.swim();
        System.out.println("------");
    }

    @Override
    public void swim() {
        System.out.println("开始");
    }

}
