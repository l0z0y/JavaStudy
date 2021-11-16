package setList.hash.linkedHashSet;

import java.util.Set;

/**
 * @author li'zi'yao
 */
public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new java.util.LinkedHashSet<>();

        set1.add("java");
        set1.add("git");
        set1.add("github");
        set1.add("gitee");
        set1.add("map");
        set1.add("git");
        set1.add("JAVA");
        System.out.println(set1);
    }
}
