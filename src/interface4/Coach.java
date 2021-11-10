package interface4;

/**
 * @author li'zi'yao
 */
public abstract class Coach extends Humanity {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }


    public abstract void teach() ;

}
