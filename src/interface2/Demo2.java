package interface2;

/**
 * @author li'zi'yao
 */
public class Demo2 {

    public static void main(String[] args) {
         Inter i = new InterImpl() ;

        System.out.println(Inter.mum);
        System.out.println(Inter.mum2);

        i.method();
    }
}
