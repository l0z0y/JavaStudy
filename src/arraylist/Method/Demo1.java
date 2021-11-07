package arraylist.Method;

import java.util.ArrayList;

/**
 * @author li'zi'yao
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("asdasd");
        list.add("java");
        list.add("git");

        //指定位置添加元素  add( int index , E element )
        list.add(2,"github");

        //删除指定的元素，返回 boolean，删除成功返回ture，失败返回false
        System.out.println(list.remove("asdasd"));

        //删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));

        //修改指定索引处的元素,返回被修改的元素
        System.out.println(list.set(1, "zzz"));

        //返回指定索引处的元素
        System.out.println(list.get(1));

        //返回集合中元素的个数
        System.out.println(list.size());


        System.out.println(list );
    }
}
