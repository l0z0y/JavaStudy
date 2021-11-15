package traverse.Lambda;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @author li'zi'yao
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);
        s.forEach(System.out::println);

    }
}
