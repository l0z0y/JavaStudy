package returnvalue;

public class Demo1 {
    public static void main(String[] args) {
        CatOperator a = new CatOperator();
        Cat c = new Cat();

        a.useCat(c);

        Cat c2 = a.getCat();
        c2.eat();
    }
}
