package innerclass5;

/**
 * @author li'zi'yao
 */
public class Demo5 {
    public static void main(String[] args) {
        Operate o = new Operate();
       o.method(new Jump() {
           @Override
           public void jump() {

           }
       });


    }
}
