package abstract3;

public class Demo3 {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setAge(15);
        c.setName("zzz");
        System.out.println(c.getName() + "\t" + c.getAge());
        Animal z = new Cat(123, "aaaa");
        System.out.println(z.getName() + "\t" + z.getAge());

        Animal d = new Dog();
        d.setAge(22);
        d.setName("qwe");
        System.out.println(d.getName()+"\t"+d.getAge());

        Animal dd = new Dog(33,"zzxcq");
        System.out.println(dd.getName()+"\t"+dd.getAge());

    }
}
