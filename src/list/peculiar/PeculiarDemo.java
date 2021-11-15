package list.peculiar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author li'zi'yao
 */
public class PeculiarDemo {
    public static void main(String[] args) {

        List<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);

        s.add(1,"lxx");

        System.out.println(s.remove(3));

        System.out.println(s.get(4));

        System.out.println(s.set(0,"xxxx"));

        System.out.println(s);
        s.clear();
    }
}
