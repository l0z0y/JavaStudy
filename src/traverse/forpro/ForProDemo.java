package traverse.forpro;

import java.util.ArrayList;
import java.util.Collection;

public class ForProDemo {
    public static void main(String[] args) {
        Collection<String> s = new ArrayList<>();
        s.add("lzy");
        s.add("lzz");
        s.add("lzx");
        s.add("lzc");
        s.add("lzv");
        System.out.println(s);
        for (String z : s) {
            System.out.print(z + " ");

        }
        System.out.println();
        double[] arr = {783.11, 44, 784.11, 11.11};
        for (double v : arr) {
            System.out.print(v + " ");
        }
    }
}
