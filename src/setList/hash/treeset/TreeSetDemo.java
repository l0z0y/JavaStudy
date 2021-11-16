package setList.hash.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author li'zi'yao
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        // 不重复 可按规则排序 无索引
        Set<String> set1 = new TreeSet<>();
        set1.add("java");
        set1.add("git");
        set1.add("github");
        set1.add("gitee");
        set1.add("map");
        set1.add("git");
        set1.add("JAVA");
        System.out.println(set1);

        Set<Integer> in = new TreeSet<>();
        in.add(15);
        in.add(33);
        in.add(22);
        in.add(1);

        System.out.println(in);
        System.out.println();

        //TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序
        Set<Apple> a = new TreeSet<>(( o1,  o2) -> (int) (o1.getPrice() - o2.getPrice())<=0?1:-1);
        a.add(new Apple("zzz","红",15.5));
        a.add(new Apple("zzw","红",16.5));
        a.add(new Apple("zzc","红",12.5));
        a.add(new Apple("zzx","红",15.5));

        System.out.println(a);

    }
}
