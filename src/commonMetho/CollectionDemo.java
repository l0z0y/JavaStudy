package commonMetho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author li'zi'yao
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        //list.add(E e) 添加元素
        list.add("aaaaa");
        list.add("早早早");
        list.add("java");
        list.add("xczxczx");
        list.add("cccc");
        list.add("java");
        System.out.println(list);

        // list.isEmpty() 判断集合是否为空 返回boolean
        System.out.println(list.isEmpty());
        System.out.println();

        // list.contains( e )判断集合中是否包含某个元素  返回boolean
        System.out.println(list.contains("java"));
        System.out.println(list.contains("ja"));
        System.out.println(list.contains("早早早"));

        // list.remove( e )删除某个元素 如果该元素有多个则删除该元素的第一个 返回boolean
        System.out.println(list.remove("zzzz"));
        System.out.println(list.remove("java"));
        System.out.println(list);

        // 集合转换为数组
        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println();

        // list.addAll(list2) 集合合并
        Collection<String> list2 = new ArrayList<String>();
        list2.add("git");
        list2.add("github");

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2);

        // list.clear() 清空集合
        list.clear();
        System.out.println(list);

    }

}
