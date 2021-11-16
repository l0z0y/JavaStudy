package setList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author li'zi'yao
 */
public class SetDemo {

    public static void main(String[] args) {
        //无序不重复 无索引
        HashSet<String > set1 =new HashSet<>();
        //有序 不重复 无索引
        Set<String> set = new LinkedHashSet<>();
        set.add("java");
        set.add("git");
        set.add("github");
        set.add("gitee");
        set.add("map");
        set.add("java");
        set.add("JAVA1");

        System.out.println(set);
        System.out.println();

        set1.add("java");
        set1.add("git");
        set1.add("github");
        set1.add("gitee");
        set1.add("map");
        set1.add("git");
        set1.add("JAVA");
        System.out.println(set1);
        System.out.println(set1.hashCode());
        System.out.println(set.hashCode());

    }
}
