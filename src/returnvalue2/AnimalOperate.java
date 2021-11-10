package returnvalue2;

/**
 * @author li'zi'yao
 */
public class AnimalOperate {
    public void  useAnimal(Animal a ){

        a.eat();
    }
    public Animal getAnimal(){
        Animal a = new Cat();
        return a ;

    }


}
