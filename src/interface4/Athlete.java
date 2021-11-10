package interface4;

/**
 * @author li'zi'yao
 */
public abstract class Athlete extends Humanity {


    public Athlete() {
    }

    public Athlete(int age, String name) {
        super(age, name);
    }


    public abstract void study() ;
}
