package returnvalue;

public class CatOperator {
    public void  useCat(Cat c ){
        c.eat();
    }
    public  Cat getCat() {
        Cat c = new Cat();
        return c;
    }


}
